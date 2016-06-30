package uet.jcia.shop.is;

import java.util.List;

import uet.jcia.shop.is.entities.Product;

public interface ProductDAO {
	List<Product> getAllProduct();
	Product getProductById(Integer productId);
	boolean addNewProduct(Product product);
	boolean deleteProduct(Product product);
	boolean updateProduct(Product product);
}
