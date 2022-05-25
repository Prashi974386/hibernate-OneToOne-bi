package com.ty.onetoonebai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehiclCharcey {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicl vehicl = entityManager.find(Vehicl.class, 0);
		if(vehicl != null)
		{
			System.out.println("Vehicle Id:"+vehicl.getId());
			System.out.println("Vehicle Name:"+vehicl.getName());
			System.out.println("Vehicle Cost:"+vehicl.getCost());
			Charcey charcey = vehicl.getCharcey();
			if(charcey != null)
			{
				System.out.println("Charcey id:"+charcey.getId());
				System.out.println("Charcey Number:"+charcey.getCharceyNumber());
				System.out.println("Charcey Type:"+charcey.getType());
			}else
			{
				System.out.println("No charcey is there");
			}
		}else
		{
			System.out.println("No Data is there");
		}
		
	}
}
