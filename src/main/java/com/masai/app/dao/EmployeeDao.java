package com.masai.app.dao;

import java.util.List;

import com.masai.app.entity.Employee;

public interface EmployeeDao {
		public void addEmployee(Employee emp);
		public Employee getEmployeeByName(String name);
		public List<Employee> getBetweenSalary(int sal1,int sal2);
		public void deleteEmployee(int emp_id);
}
