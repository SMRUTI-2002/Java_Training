package com.java.hms;

import java.util.List;
import javax.naming.NamingException;

public class PatientEjbImpl {
	public List<PatientMaster> showPatientEjb() throws NamingException {
		PatientBeanRemote remote = PatientRemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showPatient();
		}
}