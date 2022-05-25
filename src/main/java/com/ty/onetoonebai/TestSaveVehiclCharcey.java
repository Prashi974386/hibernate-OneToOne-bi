package com.ty.onetoonebai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehiclCharcey {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicl vehicl = new Vehicl();
		vehicl.setName("TATA");
		vehicl.setCost(200000);
		
		Charcey charcey = new Charcey();
		charcey.setCharceyNumber("IND98765KA");
		charcey.setType("RoadSide");
		
		vehicl.setCharcey(charcey);
		
		entityTransaction.begin();
		entityManager.persist(vehicl);
		entityTransaction.commit();
	}
}
