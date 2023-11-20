package com.hib.jsf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {
	
	public static SessionFactory getConncetion() {
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}	
}
