package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;


public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e=new Employee();
		e.setEmp_name("dnyanda");
		e.setEmp_city("hydrabad");
		e.setEmp_age(20);
		
		ss.persist(e);
		System.out.println("data inserted successfully...");
		tr.commit();
		ss.close();

	}

}
