package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	private String emp_name;
	private String emp_city;
	private int emp_age;
	
	
	public Employee() {
		
	}


	public Employee(int emp_id, String emp_name, String emp_city, int emp_age) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_city = emp_city;
		this.emp_age = emp_age;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_city() {
		return emp_city;
	}


	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}


	public int getEmp_age() {
		return emp_age;
	}


	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", emp_age="
				+ emp_age + "]";
	}
	
	

}
