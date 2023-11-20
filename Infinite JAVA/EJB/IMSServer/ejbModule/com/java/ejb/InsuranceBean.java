package com.java.ejb;

import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(InsuranceBeanRemote.class)

public class InsuranceBean implements InsuranceBeanRemote{
	
	@PersistenceContext(unitName = "EmpMgmtPU")
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public InsuranceBean() {
 
    }
	
	@Override
	public List<Insurance> showInsurance() {
		System.out.println("Entit Manager is "+entityManager);
		Query query = entityManager.createQuery("SELECT e FROM Insurance e");
		return (List<Insurance>) query.getResultList();

	}

}