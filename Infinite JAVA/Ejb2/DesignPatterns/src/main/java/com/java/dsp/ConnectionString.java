package com.java.dsp;

public class ConnectionString {
	
	private ConnectionString() {}
	
	private static ConnectionString cs;
	 public static ConnectionString getInstance() {
		if (cs == null) {
			cs = new ConnectionString();
			
		}
		return cs;
		 
	 }
     
	 public String getCredentials(String db) {
		 String result=" ";
		 switch(db) {
		 case "MySql" :
			 result="root/India@123";
			 break;
		 case "Oracle" :
			 result = "scott/tiger";
		 case "SqlServer" :
			 result = "sa/password123";
			 break;
		 }
		return db;
		 
	 }
}
