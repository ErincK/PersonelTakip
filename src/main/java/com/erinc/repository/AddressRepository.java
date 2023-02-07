package com.erinc.repository;

import com.erinc.repository.entity.Address;
import com.erinc.utility.MyFactoryRepository;

public class AddressRepository extends MyFactoryRepository<Address, Long> {
    public AddressRepository(){
        super(new Address());
    }
}
