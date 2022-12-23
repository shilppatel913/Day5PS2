package com.masai.app.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmUtils {
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("projectUnit");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
