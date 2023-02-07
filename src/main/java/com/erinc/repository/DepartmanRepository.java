package com.erinc.repository;

import com.erinc.repository.entity.Department;
import com.erinc.utility.MyFactoryRepository;

public class DepartmanRepository extends MyFactoryRepository<Department, Long> {
    public DepartmanRepository(){
        super(new Department());
    }
}
