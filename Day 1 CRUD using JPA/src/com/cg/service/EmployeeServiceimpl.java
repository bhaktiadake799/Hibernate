package com.cg.service;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoimpl;
import com.cg.entities.Employee;

public class EmployeeServiceimpl implements EmployeeService{
	private EmployeeDao dao;
	

	public EmployeeServiceimpl() {
		super();
		dao=new EmployeeDaoimpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee updateEmployeeByID(int ID) {
		// TODO Auto-generated method stub
		Employee emp=dao.updateEmployeeByID(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
