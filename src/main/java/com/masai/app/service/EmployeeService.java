package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.Employee;

public interface EmployeeService {

	public void EmployeeAdd(Employee emp);
	public Employee EmployeeName(String name);
	//gives a list of employees which are b/w sal1 and sal2
	public List<Employee> EmployeeBetweenSalary(int sal1,int sal2);
	public void EmployeeDelete(int emp_id);
}
