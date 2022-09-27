package com.example.department.repository;

import com.example.department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

public interface Departmentrepository extends JpaRepository<Department,Long>
{


    Department findByDepartmentId(Long departmentId);
}
