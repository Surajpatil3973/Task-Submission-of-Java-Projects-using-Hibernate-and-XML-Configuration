package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int stud_id=2;
		Student s=ss.get(Student.class, stud_id);
		s.setName("sayali");
		s.setAge(24);
		s.setCity("chakan");
		
		ss.merge(s);
		System.out.println("successsfully updatedd");
		tr.commit();
		ss.close();
		
		
	}

}
