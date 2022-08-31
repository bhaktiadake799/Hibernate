package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao {
	void addEmployee(Employee emp);//create 
	void updateEmployee(Employee emp);//update
	void getEmployeeById(int ID);//Retrieve
	Employee updateEmployeeByID(int ID);
	void removeEmployee(Employee emp);//delete
	
	void commitTransaction();//close an entity manager
	
	void beginTransaction();//begin the operation of Entity Manager
	

}


