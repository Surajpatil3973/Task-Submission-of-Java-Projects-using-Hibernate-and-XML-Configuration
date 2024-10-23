package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Doctor;


public class InsertData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Doctor d=new Doctor();
		d.setDoc_name("jorge");
		d.setQualification("MBBS");
		d.setAge(40);
		
		ss.persist(d);
		System.out.println("data inserted successfully...");
		tr.commit();
		ss.close();
		

	}

}
