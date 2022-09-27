package com.example.department.services;

import com.example.department.entity.Department;
import com.example.department.repository.Departmentrepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Departmentservices
{
    @Autowired
    public   Departmentrepository departmentrepository;
    public Department saveDepartment(Department department){
        log.info("inside savaDepartment method of Departmentservices");
        return departmentrepository.save(department);
    }

     public Department findDepartmentById(Long departmentId){
         log.info("inside findDepartmentById method of Departmentservices");
         return departmentrepository.findByDepartmentId(departmentId);
     }
}
