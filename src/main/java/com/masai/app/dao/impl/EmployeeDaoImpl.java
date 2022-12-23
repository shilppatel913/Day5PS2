package com.masai.app.dao.impl;

import java.util.List;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.entity.Car;
import com.masai.app.entity.Employee;
import com.masai.app.utils.EmUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class EmployeeDaoImpl implements EmployeeDao {

	public void addEmployee(Employee emp) {
		EntityManager em=EmUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		System.out.println("Employee Added");
		em.getTransaction().commit();
		return;
		

	}

	public Employee getEmployeeByName(String name) {
		EntityManager em=EmUtils.getEntityManager();
		Query query=em.createNamedQuery("employee.getByName");
		query.setParameter("ename",name);
		Employee emp=(Employee) query.getSingleResult();
		return emp;
	}

	public List<Employee> getBetweenSalary(int sal1, int sal2) {
		EntityManager em=EmUtils.getEntityManager();
		String jpql="from Employee where salary>:sal1 and salary<:sal2";
		Query query=em.createQuery(jpql);
		query.setParameter("sal1",sal1);
		query.setParameter("sal2",sal2);
		List<Employee> employees=query.getResultList();
		return employees;
	}

	public void deleteEmployee(int emp_id) {
		EntityManager em=EmUtils.getEntityManager();
		Employee e=em.find(Employee.class,emp_id);
		if(e==null) {
			System.out.println("Id not present");
			return;
		}
		
		String jpql="delete from Employee where id=:empId";
		Query query=em.createQuery(jpql);
		query.setParameter("empId", emp_id);
		em.getTransaction().begin();
		query.executeUpdate();
		System.out.println("deletion successful in Employee entity");
		em.getTransaction().commit();
		return;

	}

}
