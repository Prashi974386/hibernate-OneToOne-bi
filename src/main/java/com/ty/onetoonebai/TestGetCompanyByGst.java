package com.ty.onetoonebai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestGetCompanyByGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Company company = entityManager.find(Company.class, 1);
		System.out.println("Company  id   :"+company.getId());
		System.out.println("Company  Name   :"+company.getName());
		System.out.println("Company  Phone   :"+company.getPhone());
		System.out.println("Company  Web   :"+company.getWeb());
		
		Gst gst = company.getGst();
		System.out.println("GST id  :"+gst.getId());
		System.out.println("GST Number  :"+gst.getGstNumber());
		System.out.println("GST State  :"+gst.getState());
		System.out.println("GST Country :"+gst.getCountry());
	}
}
