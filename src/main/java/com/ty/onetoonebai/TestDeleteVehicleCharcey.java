package com.ty.onetoonebai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicleCharcey {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicl vehicl = entityManager.find(Vehicl.class, 1);
		if(vehicl != null) {
			Charcey charcey = vehicl.getCharcey();
			if(charcey != null)
			{
				entityTransaction.begin();
				entityManager.remove(vehicl);
				entityTransaction.commit();
				System.out.println("Deleted successfully");
				
			}
			else
			{
				System.out.println("No data is found");
			}
		}
		else {
			System.out.println("No data is found");
		}
	}
}
