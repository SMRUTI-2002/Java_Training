package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	
	public List<String> getNames(){
		List<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Rakesh");
		names.add("Rekha");
		names.add("Bindu");
		names.add("Rasmita");
		return names;
	}
	
	public List<Employ> showEmploy(){
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Smruti","Java","Developer",87655.33));
		employList.add(new Employ(1,"Soumya","Sql","Expert",88765.33));
		employList.add(new Employ(1,"Lopa","J2EE","Programmer",76555.33));
		employList.add(new Employ(1,"Asish","Angular","Tester",65435.33));
		employList.add(new Employ(1,"Saishree","React","Manager",90000.33));
		
		return employList;
	}

}
