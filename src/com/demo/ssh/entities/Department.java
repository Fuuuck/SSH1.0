package com.demo.ssh.entities;

import java.util.HashSet;
import java.util.Set;



public class Department {
	private Integer id;
	private String departmentName;
	private Set<Employee> employee = new HashSet<Employee>();
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(Integer id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}
	
}
