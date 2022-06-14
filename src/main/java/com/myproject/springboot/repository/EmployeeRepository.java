package com.myproject.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
