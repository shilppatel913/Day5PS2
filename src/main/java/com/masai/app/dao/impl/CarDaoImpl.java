package com.masai.app.dao.impl;

import java.util.List;

import com.masai.app.dao.CarDao;
import com.masai.app.entity.Car;
import com.masai.app.utils.EmUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class CarDaoImpl implements CarDao {

	public void createCar(Car car) {
		EntityManager em=EmUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(car);
		System.out.println("Car Added");
		em.getTransaction().commit();
		return;
	}

	public Car getCar(int carId) {
		EntityManager em=EmUtils.getEntityManager();
		String jpql="from Car where id=:carId";
		Query query=em.createQuery(jpql);
		query.setParameter("carId", carId);
		Car car=(Car)query.getSingleResult();
		if(car==null) {
			System.out.println("No such id");
			return car;
		}
		return car;
	}

	public List<Car> getAllCars() {
		EntityManager em=EmUtils.getEntityManager();
		Query query=em.createNamedQuery("Car.allCars");
		List<Car> cars=query.getResultList();
		return cars;
	}

	public void updateCar(Car car) {
		EntityManager em=EmUtils.getEntityManager();
		Car c=getCar(car.getId());
		if(c==null) {
			System.out.println("record not in database so not updated");
			return;
		}
		if(car.getModelName()!=null) {
			c.setModelName(car.getModelName());
		}
		if(car.getMakeYear()!=null) {
			c.setMakeYear(car.getMakeYear());
		}
		if(car.getColor()!=null) {
			c.setColor(car.getColor());
		}
		String jpql="update Car set modelName=:md,makeYear=:mk,color=:co where id=:carId";
		Query query=em.createQuery(jpql);
		query.setParameter("md", c.getModelName());
		query.setParameter("mk",c.getMakeYear());
		query.setParameter("co", c.getColor());
		query.setParameter("carId",c.getId());
		em.getTransaction().begin();
		query.executeUpdate();
		System.out.println("The car entity has been updated");
		em.getTransaction().commit();
		return;
	}

	public void deleteCar(int carId) {
		Car c=getCar(carId);
		if(c==null) {
			System.out.println("Id not present");
			return;
		}
		EntityManager em=EmUtils.getEntityManager();
		String jpql="delete from Car where id=:carId";
		Query query=em.createQuery(jpql);
		query.setParameter("carId", carId);
		em.getTransaction().begin();
		query.executeUpdate();
		System.out.println("deletion successful in car entity");
		em.getTransaction().commit();
		return;
	}

}
