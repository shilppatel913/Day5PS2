package com.masai.app.service;

import java.util.List;

import com.masai.app.dao.impl.EmployeeDaoImpl;
import com.masai.app.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public void EmployeeAdd(Employee emp) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		employeeDaoImpl.addEmployee(emp);
		return;

	}

	public Employee EmployeeName(String name) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		Employee emp=employeeDaoImpl.getEmployeeByName(name);
		return emp;
	}

	public List<Employee> EmployeeBetweenSalary(int sal1, int sal2) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		List<Employee> employees=employeeDaoImpl.getBetweenSalary(sal1, sal2);
		return employees;
	}

	public void EmployeeDelete(int emp_id) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		employeeDaoImpl.deleteEmployee(emp_id);
		return;
	}

}
