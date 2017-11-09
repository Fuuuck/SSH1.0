package com.demo.ssh.actions;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.demo.ssh.entities.Employee;
import com.demo.ssh.service.DepartmentService;
import com.demo.ssh.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction extends ActionSupport implements RequestAware,
	ModelDriven<Employee>,Preparable{
	private DepartmentService departmentService;
	private EmployeeService employeeService;
	private Integer id;
	private Employee model;
	private Map<String,Object> request;
	public String delete(){
		employeeService.delete(id);
		return SUCCESS;
	}
	@Override
	public Employee getModel() {
		return model;
	}
	public String input(){
		request.put("departments", departmentService.getAll());
		return INPUT;
	}
	public String list(){
		request.put("employees", employeeService.getAll());
		return "list";
	}
	@Override
	public void prepare() throws Exception {}
	public void prepareInput(){
		if(id != null){
			model = employeeService.get(id);
		}
	}

	public void prepareSave(){
		System.out.println(model);
		if(id == null){
			model = new Employee();			
		}else {
			model = employeeService.get(id);
		}
	}
	public String save(){
		//System.out.println(model);
		if(id == null){
			model.setCreateTime(new Date());			
		}
		employeeService.saveOrUpdate(model);
		return SUCCESS;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
		
	}
}
