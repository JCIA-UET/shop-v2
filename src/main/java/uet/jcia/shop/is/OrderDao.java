package uet.jcia.shop.is;

import java.util.List;

import uet.jcia.shop.is.entities.Order;

public interface OrderDao {
	List<Order> getAllOrder();
	Order getOrderById(Integer orderId);
	boolean addNewOrder(Order order);
	boolean deleteOrder(Order order);
	boolean updateOrder(Order order);
	Double getTotal(Order order);
}
