package com.test.thales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.thales.model.Employee;
import com.test.thales.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
	
	public Employee editEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
	
	public void deleteEmployeeById(Long idemployee) {
		employeeRepository.deleteById(idemployee);
    }
	
	public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(Long idemployee) {
        return employeeRepository.findById(idemployee);
    }

}
