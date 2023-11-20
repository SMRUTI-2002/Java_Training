package com.java.agent;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
/*
import com.java.hib.Employ;
import com.java.hib.Gender;
*/
public class AgentInsertMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("Enter AgentId");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name");
		agent.setName(sc.next());
		System.out.println("Enter Agent City");
		agent.setCity(sc.next());
		System.out.println("EnteR Gender (MALE/FEMALE)");
		//agent.setGender(Gender.valueOf(sc.next()));
		//System.out.println("Enter Agent MaritalStatus");
		System.out.println("Enter Premium");
		agent.setPremium(sc.nextDouble());
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
	    Transaction transaction = session.beginTransaction();
		session.save(agent);
		transaction.commit();
		System.out.println("***Agent Record Inserted***");
	}
	
}
