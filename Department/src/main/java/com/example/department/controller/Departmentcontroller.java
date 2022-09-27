package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.services.Departmentservices;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j  //LoggerId
public class Departmentcontroller
{
    @Autowired

    public Departmentservices departmentservices;
   @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside savaDepartment method of Departmentcontroller");
        return departmentservices.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDepartmentById method of Departmentcontroller");

        return departmentservices.findDepartmentById(departmentId);
    }
}
