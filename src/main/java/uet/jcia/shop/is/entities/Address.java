package uet.jcia.shop.is.entities;

public class Address {
	private Integer addressId;
	private String firstName;
	private String lastName;
	private String address;
	
	public Address() {
		
	}
	
	public Address(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [getAddressId()=" + getAddressId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	
}
