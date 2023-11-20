package com.java.ejb;

import java.sql.SQLException;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class PatientEjbImpl {
	public String redirectAddEjb(String did) throws NamingException, ClassNotFoundException, SQLException {
		Map<String, Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		 sessionMap.put("dId", did);
		 return "addPatient.jsp?faces-redirect=true";
		}
	
	public String addPatientEjb(PatientMaster patient) throws NamingException, ClassNotFoundException, SQLException {
		PatientBeanRemote remote = PatientRemoteHelper.lookupRemoteStatelessEmploy();
		remote.addPatient(patient);
		return "addSuccess.jsp?faces-redirect=true";
	}
	
}
