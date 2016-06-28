package uet.jcia.shop.is.entities;

public class OrderItem {
	private Integer orderItemId;
	private Integer orderId;
	private Integer productId;
	private String name;
	private String model;
	private Integer quantity;
	private Double price;
	private Double total;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer orderId, Integer productId, String name, String model, Integer quantity, Double price,
			Double total) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.name = name;
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "OrderItem [getOrderItemId()=" + getOrderItemId() + ", getOrderId()=" + getOrderId()
				+ ", getProductId()=" + getProductId() + ", getName()=" + getName() + ", getModel()=" + getModel()
				+ ", getQuantity()=" + getQuantity() + ", getPrice()=" + getPrice() + ", getTotal()=" + getTotal()
				+ "]";
	}
	
}
