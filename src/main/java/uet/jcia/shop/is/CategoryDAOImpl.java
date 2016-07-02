package uet.jcia.shop.is;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import uet.jcia.shop.is.entities.Category;
import uet.jcia.shop.is.entities.Product;

public class CategoryDAOImpl implements CategoryDAO{
	private Session crtSession;
	private Transaction crtTransaction;
	
	public Session getCrtSession() {
		return crtSession;
	}

	public void setCrtSession(Session crtSession) {
		this.crtSession = crtSession;
	}

	public Transaction getCrtTransaction() {
		return crtTransaction;
	}

	public void setCrtTransaction(Transaction crtTransaction) {
		this.crtTransaction = crtTransaction;
	}
	
	public Session openCrtSession() {
		crtSession = HibernateUtils.getSessionFactory().openSession();
		return crtSession;
	}
	
	public Session openCrtSessionAndTransaction() {
		crtSession = HibernateUtils.getSessionFactory().getCurrentSession();
		crtTransaction = crtSession.beginTransaction();
		return crtSession;
	}
	
	public void closeCrtSession() {
		crtTransaction.commit();
		crtSession.close();
	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		openCrtSessionAndTransaction();
		List<Category> cates = (List<Category>) getCrtSession().createQuery("from Category").list();
		closeCrtSession();
		return cates;
	}

	@Override
	public Category getCategoryById(Integer categoryId) {
		// TODO Auto-generated method stub
		openCrtSessionAndTransaction();
		String hql = "from Category where categoryId = '" + categoryId +"'";
		Category cate = null;
		cate = (Category) getCrtSession().createQuery(hql).uniqueResult();
		closeCrtSession();
		return cate;
	}

	@Override
	public boolean addNewCategory(Category category) {
		// TODO Auto-generated method stub
		openCrtSessionAndTransaction();
		getCrtSession().save(category);
		closeCrtSession();
		return true;
	}

	@Override
	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		openCrtSessionAndTransaction();
		getCrtSession().delete(category);
		closeCrtSession();
		return true;
	}

	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		openCrtSessionAndTransaction();
		getCrtSession().update(category);
		closeCrtSession();
		return true;
	}
	
	public Set<Product> getAllProductsOfCategory(Category category) {
		return category.getProducts();
	}

}
