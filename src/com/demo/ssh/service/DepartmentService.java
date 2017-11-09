package com.demo.ssh.service;

import java.util.List;

import com.demo.ssh.dao.DepartmentDao;
import com.demo.ssh.entities.Department;

public class DepartmentService {
		private DepartmentDao departmentDao;
		public void setDepartmentDao(DepartmentDao departmentDao) {
			this.departmentDao = departmentDao;
		}
		public List<Department> getAll(){
			return departmentDao.getAll();
		}
}
