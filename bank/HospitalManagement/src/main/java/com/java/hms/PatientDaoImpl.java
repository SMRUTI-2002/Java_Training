package com.java.hms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PatientDaoImpl implements PatientDAO{
	
	 private SessionFactory sf;
	    private Session session;

	@Override
	public String addPatientDao(Patient patient) {
	        sf = SessionHelper.getConnection();
	        session = sf.openSession();
	        Transaction trans = session.beginTransaction();
	        session.save(patient);
	        trans.commit();
	        return "PatientAddedPage.jsp?faces-redirect=true";
	}

}
