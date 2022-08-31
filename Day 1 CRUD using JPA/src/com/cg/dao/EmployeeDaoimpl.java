package com.cg.dao;

import javax.persistence.EntityManager;
import com.cg.entities.Employee;


import com.cg.entities.Employee;

public class EmployeeDaoimpl implements EmployeeDao
{
	//we are going to use EntityManager method-CRUD
	private EntityManager em;
	
	//default constructor 
	public EmployeeDaoimpl() {
		super();
		em=JPA_Util.getEntityManager();
	}

	@Override
	public void addEmployee(Employee emp)
	{
		em.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
	}

	@Override
	public Employee updateEmployeeByID(int ID){
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		em.remove(emp);
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void getEmployeeById(int ID) {
		// TODO Auto-generated method stub
		
	}

}