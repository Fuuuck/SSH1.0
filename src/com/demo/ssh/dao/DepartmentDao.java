package com.demo.ssh.dao;

import java.util.List;

import com.demo.ssh.entities.Department;

public class DepartmentDao extends BaseDao{
	public List<Department> getAll(){
		String sql = "from Department";
		return getSession().createQuery(sql).list();
	}
}
