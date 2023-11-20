package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

public class PatientReportController {
	private PatientReport patientReport;
    private PatientReportEjbImpl dao;

    public PatientReportEjbImpl getInstance() {
        if (dao == null) {
            dao = new PatientReportEjbImpl();
        }
        return dao;
    }

    
    
    public PatientReport getPatientReport() {
		return patientReport;
	}



	public void setPatientReport(PatientReport patientReport) {
		this.patientReport = patientReport;
	}



	public PatientReportEjbImpl getDao() {
        return dao;
    }

    public void setDao(PatientReportEjbImpl dao) {
        this.dao = dao;
    }

    public String addPatientReports() throws ClassNotFoundException, NamingException, SQLException {
        getInstance();
        return dao.addPatientReportEjb(null);
    }

    public String addPatientReportsByDept(String dept) throws ClassNotFoundException, NamingException, SQLException {
        getInstance();
        return dao.addPatientReportEjb(null);
    }
}


