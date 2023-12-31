package com.java.infinite;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class LoginDAOImpl implements LoginDAO{
	
	SessionFactory sf;
	Session session;

	@Override
	public String addUser(Login login) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(login);
		trans.commit();
		return "user added....";
	}

	@Override
	public Login authenticate(Login login) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		String pwd = EncryptPassword.getCode(login.getPassCode());		
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", login.getPassCode()));
		Login res = (Login) cr.uniqueResult();
		return res;
	}

	@Override
	public long loginValidate(Login login) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		String pwd = EncryptPassword.getCode(login.getPassCode());		
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", login.getPassCode()));
		cr.setProjection(Projections.rowCount());
		long count = (Long) cr.uniqueResult();
		return count;
	}
	
    
}

