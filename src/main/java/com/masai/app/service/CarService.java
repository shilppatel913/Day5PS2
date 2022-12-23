package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.Car;

public interface CarService {
	public void CarCreate(Car car);
	public Car CarGet(int carId);
	public List<Car> CarsGetAll();
	public void CarUpdate(Car car);
	public void CarDelete(int carId);
}
