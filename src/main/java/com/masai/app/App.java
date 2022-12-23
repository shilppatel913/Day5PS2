package com.masai.app;

import java.time.LocalDate;
import java.util.List;

import com.masai.app.entity.Car;
import com.masai.app.entity.Employee;
import com.masai.app.service.CarServiceImpl;
import com.masai.app.service.EmployeeServiceImpl;

public class App {
	public static void main(String args[]) {
		//crud operations for car
		CarServiceImpl carServiceImpl=new CarServiceImpl();
//		Car car=carServiceImpl.CarGet(1);
//		System.out.println(car);
		
//		Car car=new Car(2,"Mercedes","2013","Black");
//		carServiceImpl.CarCreate(car);
		
//		List<Car> cars=carServiceImpl.CarsGetAll();
//		System.out.println(cars.toString());
		
//		Car car=new Car();
//		car.setId(2);
//		car.setModelName("Kia");
//		carServiceImpl.CarUpdate(car);
		
//		carServiceImpl.CarDelete(2);
		
		
		//crud operations for Employee
		EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
//		Employee emp=employeeServiceImpl.EmployeeName("Shilp");
//		System.out.println(emp);
		
//		Employee emp=new Employee(2,"Isha","Developer",1000,LocalDate.now());
//		employeeServiceImpl.EmployeeAdd(emp);
		
		//gettting employees who are between salary1 and salary2
//		List<Employee> employees=employeeServiceImpl.EmployeeBetweenSalary(1000, 5000);
//		for(Employee e:employees) {
//			System.out.println(e.getId());
//			System.out.println(e.getName());
//			System.out.println(e.getDept());
//			System.out.println(e.getSalary());
//			System.out.println(e.getDateOfBirth());
//		}
		
		employeeServiceImpl.EmployeeDelete(3);
	}
}
