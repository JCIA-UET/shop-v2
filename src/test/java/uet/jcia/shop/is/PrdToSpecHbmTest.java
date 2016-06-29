package uet.jcia.shop.is;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import uet.jcia.shop.is.entities.Product;
import uet.jcia.shop.is.entities.Category;
import uet.jcia.shop.is.entities.Specification;

public class PrdToSpecHbmTest {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
//        Set<Specification> specs = new HashSet<>();
//        specs.add(new Specification("Nha san xuat"));
//        specs.add(new Specification("Bao hanh"));
        
        Category cate = new Category(0,"dien thoai", "dien thoat cate");
        Product product = new Product(
        		10, 1, 100.0, "Apple", "dien thoai", "model1", "image", new Date(), new Date(), cate);

        Set<Product> products = new HashSet<>();
        products.add(product);
        cate.setProducts(products);
        
        session.save(cate);
        
        transaction.commit();
        session.close();
        HibernateUtils.closeSessionFactory();
    }
}
