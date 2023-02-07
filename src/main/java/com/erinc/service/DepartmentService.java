package com.erinc.service;

import com.erinc.repository.DepartmanRepository;
import com.erinc.repository.entity.Department;
import com.erinc.utility.MyFactoryService;

public class DepartmentService extends MyFactoryService<DepartmanRepository, Department, Long> {
    public DepartmentService(){
        super(new DepartmanRepository());
    }
}
