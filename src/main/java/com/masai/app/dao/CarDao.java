package com.masai.app.dao;

import java.util.List;

import com.masai.app.entity.Car;

public interface CarDao {

		public void createCar(Car car);
		public Car getCar(int carId);
		public List<Car> getAllCars();
		public void updateCar(Car car);
		public void deleteCar(int carId);
}
