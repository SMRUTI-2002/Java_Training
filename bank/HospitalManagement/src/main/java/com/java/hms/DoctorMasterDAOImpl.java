package com.java.hms;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DoctorMasterDAOImpl implements DoctorMasterDAO{
	
	 private SessionFactory sf;
	    private Session session;

	@Override
	public List<DoctorMaster> showDoctorsDao() {
		// TODO Auto-generated method stub
		 sf = SessionHelper.getConnection();
	        session = sf.openSession();
	        Criteria criteria = session.createCriteria(DoctorMaster.class);
	        List<DoctorMaster> doctorsList = criteria.list();
	        return doctorsList;
	}

}
