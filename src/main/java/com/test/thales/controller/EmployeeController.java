package com.test.thales.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.thales.model.Employee;
import com.test.thales.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/employee")
@Api(tags = "employee")
@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;
	
	static Logger log = Logger.getLogger(EmployeeController.class);
	
	
	@PostMapping(path = "/insert")
	@ResponseBody
    @ApiOperation(value = "Insert Employee", response = Employee.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public Employee insertEmployee (@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
	
	
	@PutMapping(path = "/update")
	@ResponseBody
	@ApiOperation(value = "Update Employee", response = Employee.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.editEmployee(employee);
	}

@DeleteMapping(path = "/delete")
@ResponseBody
@ApiOperation(value = "Delete Employee", response = Employee.class)
@ApiResponses(value = {
    @ApiResponse(code = 400, message = "Something went wrong"),
    @ApiResponse(code = 401, message = "Access denied"),
    @ApiResponse(code = 404, message = "The Employee doesn't exist")})
public void deleteEmployeeById(@RequestParam Long idemployee) {
	employeeService.deleteEmployeeById(idemployee);
}


@GetMapping(path = "/all")
@ResponseBody
@ApiOperation(value = "Get All Employee", response = Employee.class)
@ApiResponses(value = {
        @ApiResponse(code = 400, message = "Something went wrong"),
        @ApiResponse(code = 401, message = "Access denied"),
        @ApiResponse(code = 404, message = "The Employee doesn't exist")})
public List<Employee> getAllEmployee() {
    return employeeService.getAllEmployee();
}

 	@GetMapping(path = "/getByID")
 	@ResponseBody
    @ApiOperation(value = "Get ByID Detalle Employee", response = Employee.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Employee doesn't exist")})
    public Optional<Employee> getAllEmployee(@RequestParam Long idemployee) {
        return employeeService.getById(idemployee);
    }


}
