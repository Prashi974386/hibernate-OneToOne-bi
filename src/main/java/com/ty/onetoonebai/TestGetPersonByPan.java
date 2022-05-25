package com.ty.onetoonebai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonByPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pan pan  = entityManager.find(Pan.class, 1);
		System.out.println("Pan id   :"+pan.getId());
		System.out.println("Pan Address:"+pan.getAddress());
		System.out.println("Pan PannNumber:"+pan.getPanNumber());
		Person person = pan.getPerson();
		System.out.println("Person id :"+person.getId());
		System.out.println("Person Name:"+person.getName());
		System.out.println("Person Email:"+person.getEmail());
		System.out.println("Person Phone:"+person.getPhone());
		
		
	}
}
