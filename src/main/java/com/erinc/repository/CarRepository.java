package com.erinc.repository;

import com.erinc.repository.entity.Car;
import com.erinc.utility.MyFactoryRepository;

public class CarRepository extends MyFactoryRepository<Car, Long> {
    public CarRepository(){
        super(new Car());
    }
}
