package com.java.inf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDetails {
	
	public static void main(String[] args) {
		SessionFactory factory= 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Student e1 = new Student();
		e1.setStudentId(100);
		e1.setName("Sujata");
		e1.setMobileNo(876587656);
		e1.setBloodGroup("B+");
		e1.setStudentClass("V");
		session.save(e1);
		
		StudentIdCard studentidcard1 = new StudentIdCard();
		studentidcard1.setCardNumber(15);	
		studentidcard1.setCardNumber1("15");
		studentidcard1.setIssueDate("09-10-2023");
		studentidcard1.setExpirationDate("15-10-2023");
		e1.setStudentIdCard(studentidcard1);
		studentidcard1.setstudentidcard1(e1);
		session.save(studentidcard1);
		t.commit();
		
		session.close();
		System.out.println("success");
	}

}
