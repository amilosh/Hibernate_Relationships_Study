package by.it.milosh.repository.dao;

import by.it.milosh.entity.manyToOne.Address;

public interface AddressDao {

    void addAddress(Address address);

    Address getAddress(Long address_id);

    void deleteAddress(Address address);

    void deleteAddressById(Long address_id);

    void deleteAddressByIdCustom(Long address_id);

}
