package com.masai.app.service;

import java.util.List;

import com.masai.app.dao.impl.CarDaoImpl;
import com.masai.app.entity.Car;

public class CarServiceImpl implements CarService {

	public void CarCreate(Car car) {
		CarDaoImpl carDaoImpl=new CarDaoImpl();
		carDaoImpl.createCar(car);
		return;
	}

	public Car CarGet(int carId) {
		CarDaoImpl carDaoImpl=new CarDaoImpl();
		Car car=carDaoImpl.getCar(carId);
		return car;
		
	}

	public List<Car> CarsGetAll() {
		CarDaoImpl carDaoImpl=new CarDaoImpl();
		List<Car> cars=carDaoImpl.getAllCars();
		return cars;
		
	}

	public void CarUpdate(Car car) {
		CarDaoImpl carDaoImpl=new CarDaoImpl();
		carDaoImpl.updateCar(car);
		return;
		
	}

	public void CarDelete(int carId) {
		CarDaoImpl carDaoImpl=new CarDaoImpl();
		carDaoImpl.deleteCar(carId);
		return;
		
	}
			
}
