package uet.jcia.shop.is;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import uet.jcia.shop.is.entities.Order;

public class OrderDAOImpl implements OrderDao {

	@Override
	public List<Order> getAllOrder() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Order> listOrder;
		try{
			session.beginTransaction();
			
			Query query = session.createQuery("FROM Order");
			listOrder = query.list();
			session.getTransaction().commit();
			session.close();
		}
		finally{
			sessionFactory.close();
		}
		return listOrder;
	}

	@Override
	public Order getOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNewOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Double getTotal(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
