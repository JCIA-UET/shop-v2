package uet.jcia.shop.is;

import java.util.List;

import uet.jcia.shop.is.entities.Order;

public interface OrderItemDAO {
	List<OrderItemDAO> getOrderItemByOrderId(Integer orderId);
	boolean addNewOrderItem(OrderItemDAO item);
	boolean deleteOrderItem(OrderItemDAO item);
	boolean updateOrderItem(OrderItemDAO item);
	boolean isOrderHasItem(Order order, OrderItemDAO item);
}
