package com.mircorservice.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mircorservice.departmentservice.entity.Department;

public interface DepartmentReposity extends JpaRepository<Department,Long>{

}
