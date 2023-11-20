package com.java.inf;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowDetails {
	
	public static void main(String[] args) {
		SessionFactory factory= 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Student");
		List<Student> list=query.list();
		
		for (Student student : list) {
			System.out.println(student.getStudentId()+" "+student.getName()+" "+student.getMobileNo()
			+" "+student.getBloodGroup()+" "+student.getStudentClass());
			StudentIdCard studentIdCard =student.getStudentIdCard();
			System.out.println(studentIdCard.getCardNumber1()+" "+studentIdCard.getIssueDate()
			      +" "+studentIdCard.getExpirationDate());
					
		}
		session.close();
	}

}
