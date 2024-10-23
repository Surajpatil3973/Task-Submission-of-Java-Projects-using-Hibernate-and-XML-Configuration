package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int emp_id = 2;
		Employee s = ss.get(Employee.class, emp_id);
		s.setEmp_name("pallvi");
		s.setEmp_city("ahamadabad");
		s.setEmp_age(98);
		ss.merge(s);

		System.out.println("successsfully updatedd");
		tr.commit();
		ss.close();

	}

}
