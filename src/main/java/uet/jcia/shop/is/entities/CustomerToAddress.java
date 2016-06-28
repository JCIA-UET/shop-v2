package uet.jcia.shop.is.entities;

public class CustomerToAddress {
	private Integer customerId;
	private Integer addressId;
	
	public CustomerToAddress() {
		
	}
	
	public CustomerToAddress(Integer customerId, Integer addressId) {
		this.customerId = customerId;
		this.addressId = addressId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "CustomerToAddress [getCustomerId()=" + getCustomerId() + ", getAddressId()=" + getAddressId() + "]";
	}
	
	
	
}


