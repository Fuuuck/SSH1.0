package com.demo.ssh.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;

import com.demo.ssh.entities.Employee;

public class EmployeeDao extends BaseDao{
	public void delete(Integer id){
		String sql = "delete from Employee e where e.id = ?";
		getSession().createQuery(sql).setInteger(0, id).executeUpdate();
	}
	public List<Employee> getAll(){
		String sql = "from Employee e left join fetch e.department";
		return  getSession().createQuery(sql).list();
	}
	public void saveOrUpdate(Employee employee){
		getSession().saveOrUpdate(employee);
	}
	public Employee get(Integer id){
		return (Employee)getSession().get(Employee.class, id);
	}
}
