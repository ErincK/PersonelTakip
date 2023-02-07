package com.erinc;

import com.erinc.repository.CarRepository;
import com.erinc.repository.entity.*;
import com.erinc.service.AddressService;
import com.erinc.service.CarService;
import com.erinc.service.DepartmentService;
import com.erinc.service.PersonService;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;

public class PersonApplication {
    public static void main(String[] args) {

        List<Address> addressList = new ArrayList<>();
        addressList.add(Address.builder().city("Eindhoven").build());
        addressList.add(Address.builder().city("Rotherdam").build());
        addressList.add(Address.builder().city("Amsterdam").build());
        //AddressService addressService = new AddressService();
        //addressService.saveAll(addressList);
        Car car = Car.builder().marka("Jeep").build();
        new CarService().save(car);
        Department department = Department.builder().name("Muhasebe").build();
        Person person = Person.builder()
                .age(34)
                .name("Erinc")
                .gender(EGender.M)
                .addresses(addressList)
                .car(car)
                .department(department)
                .build();
        Person person2 = Person.builder()
                .age(34)
                .name("Hakan")
                .gender(EGender.M)
                .department(department)
                .build();
        Person person3 = Person.builder()
                .age(34)
                .name("Sufle")
                .gender(EGender.M)
                .department(department)
                .build();
        //PersonService personService = new PersonService();
        //personService.save(person);
        //Alternatif kullanım
        new PersonService().save(person);
        new PersonService().save(person2);
        new PersonService().save(person3);

        new DepartmentService().findAll().forEach(x->{
            System.out.println(x.getName());
            x.getPersonList().forEach(p->{
                System.out.println(p.getId()+ " - "+ p.getName());
            });
        });
    }
}