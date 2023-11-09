package com.java.ejb;

import java.util.List;

public interface InsurancePlanDAO {
	
	List<InsurancePlan> showInsurancePlansByinsuranceId(int insuranceId);

}
