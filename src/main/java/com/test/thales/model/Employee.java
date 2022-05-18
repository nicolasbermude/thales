package com.test.thales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity (name = "Employee")
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** Tabla Employee */
    @Column(name = "idemployee")
    private Long id;
	
	
	@Column(name = "name", nullable = false, unique = true)
    /** Tabla Employee */
    private String name;
	
	
	@Column(name = "document", nullable = false)
    /** Tabla Employee */
    private String document;
	
	@Column(name = "phone", nullable = false, updatable = true)
    /** Tabla Employee */
    private Integer phone;
	
	
	@Column(name = "email", nullable = false, updatable = true)
    /** Tabla Employee */
    private String email;

	
	@Column(name = "salary", nullable = false, updatable = true)
    /** Tabla Employee */
    private Long salary;
	
	
	


	public Employee() {
	
	}





	public Employee(Long id, String name, String document, Integer phone, String email, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.document = document;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getDocument() {
		return document;
	}





	public void setDocument(String document) {
		this.document = document;
	}





	public Integer getPhone() {
		return phone;
	}





	public void setPhone(Integer phone) {
		this.phone = phone;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Long getSalary() {
		return salary;
	}





	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
}
