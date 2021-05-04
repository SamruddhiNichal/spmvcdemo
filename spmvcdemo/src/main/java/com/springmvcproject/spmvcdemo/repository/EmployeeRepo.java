package com.springmvcproject.spmvcdemo.repository;

import com.springmvcproject.spmvcdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
