package com.demo.ssh.service;

import java.util.List;

import com.demo.ssh.dao.EmployeeDao;
import com.demo.ssh.entities.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	public void delete(Integer id){
		employeeDao.delete(id);
	}
	public void saveOrUpdate(Employee employee){
		employeeDao.saveOrUpdate(employee);
	}
	public List<Employee> getAll(){
		return employeeDao.getAll();
	}
	public Employee get(Integer id) {
		return employeeDao.get(id);
	}
}
