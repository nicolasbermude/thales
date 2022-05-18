package com.test.thales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.thales.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
