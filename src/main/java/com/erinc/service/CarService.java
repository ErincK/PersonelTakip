package com.erinc.service;

import com.erinc.repository.CarRepository;
import com.erinc.repository.entity.Car;
import com.erinc.utility.MyFactoryService;

public class CarService extends MyFactoryService <CarRepository, Car, Long>{
    public CarService(){
        super(new CarRepository());
    }
}
