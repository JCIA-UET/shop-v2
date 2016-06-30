package uet.jcia.shop.is;

import java.util.List;

import uet.jcia.shop.is.entities.Address;

public interface AddressDAO {
	List<Address> getAllAddress();
	Address getAddressById(Integer addressId);
	boolean addNewAddress(Address address);
	boolean deleteAddress(Address address);
	boolean updateAddress(Address address);
}
