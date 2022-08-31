package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceimpl;

public class client {
	public static void main(String[]args) {
		EmployeeService ser=new EmployeeServiceimpl();
		Employee emp=new Employee();
		emp.setID(987);
		emp.setNAME("Bhakti");
		ser.addEmployee(emp);
		
		
	}

}
