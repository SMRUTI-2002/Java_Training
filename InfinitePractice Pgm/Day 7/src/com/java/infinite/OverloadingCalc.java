package com.java.infinite;

public class OverloadingCalc {
	// Method to add two integers (int and long)
	void sum(int a,long b){
		System.out.println(a+b);
		}  
	  void sum(int a,int b,int c){
		  System.out.println(a+b+c);
		  }  
	  
	  public static void main(String args[]){  
	  OverloadingCalc obj=new OverloadingCalc();  
	  obj.sum(20,20);//now second int literal will be promoted to long  
	  obj.sum(20,20,20);  
	  
	  }  
}
