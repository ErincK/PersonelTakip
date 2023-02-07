package com.erinc.service;

import com.erinc.repository.AddressRepository;
import com.erinc.repository.entity.Address;
import com.erinc.utility.MyFactoryService;

public class AddressService extends MyFactoryService<AddressRepository, Address, Long> {
    public AddressService(){
        super(new AddressRepository());
    }
}
