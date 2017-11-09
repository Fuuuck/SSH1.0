package com.demo.ssh.entities;

import java.util.Date;

public class Employee {
	private Integer id;
	//涓嶈兘琚慨鏀�
	private String lastName;
	private String email;
	//浠庡墠绔紶鍏ョ殑鏄疭string绫诲瀷 锛屾墍浠ユ敞鎰忚浆鎹�
	private Date birth;
	//鍒涘缓鏃堕棿涓嶈兘琚慨鏀�
	private Date createTime;
	//澶氬涓�鐨勫崟鍚戝叧鑱�
	private Department department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String lastName, String email, Date birth, Date createTime, Department department) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.birth = birth;
		this.createTime = createTime;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", birth=" + birth
				+ ", createTime=" + createTime + ", department.id=" + department.getId() + "]";
	}

}
