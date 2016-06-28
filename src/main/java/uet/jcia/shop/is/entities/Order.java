package uet.jcia.shop.is.entities;

import java.util.Date;

public class Order {
	private Integer orderId;
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String telephone;
	private String address;
	private String comment;
	private Integer status;
	private Double total;
	private Date dateAdded;
	private Date dateModified;
	
	public Order() {
		
	}
	
	public Order(Integer customerId, String firstName, String lastName, String telephone, String address,
			String comment, Integer status, Double total, Date dateAdded, Date dateModified) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.address = address;
		this.comment = comment;
		this.status = status;
		this.total = total;
		this.dateAdded = dateAdded;
		this.dateModified = dateModified;
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	
	@Override
	public String toString() {
		return "Order [getOrderId()=" + getOrderId() + ", getCustomerId()=" + getCustomerId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getTelephone()=" + getTelephone()
				+ ", getAddress()=" + getAddress() + ", getComment()=" + getComment() + ", getStatus()=" + getStatus()
				+ ", getTotal()=" + getTotal() + ", getDateAdded()=" + getDateAdded() + ", getDateModified()="
				+ getDateModified() + "]";
	}
}
