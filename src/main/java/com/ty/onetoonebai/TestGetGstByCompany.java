package com.ty.onetoonebai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetGstByCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst = entityManager.find(Gst.class, 1);
		System.out.println("GST id  :"+gst.getId());
		System.out.println("GST Number  :"+gst.getGstNumber());
		System.out.println("GST State  :"+gst.getState());
		System.out.println("GST Country :"+gst.getCountry());
		System.out.println("---------------------------------------");
		Company company = gst.getCompany();
		System.out.println("Company  id   :"+company.getId());
		System.out.println("Company  Name   :"+company.getName());
		System.out.println("Company  Phone   :"+company.getPhone());
		System.out.println("Company  Web   :"+company.getWeb());
	}
}
