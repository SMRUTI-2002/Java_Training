package com.java.hib;

public class SimpleCalc {
	
	private double principalAmount;
    private double rateOfInterest;
    private int numberOfYears;
    
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public SimpleCalc(double principalAmount, double rateOfInterest, int numberOfYears) {
		super();
		this.principalAmount = principalAmount;
		this.rateOfInterest = rateOfInterest;
		this.numberOfYears = numberOfYears;
	}
	public SimpleCalc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SimpleCalc [principalAmount=" + principalAmount + ", rateOfInterest=" + rateOfInterest
				+ ", numberOfYears=" + numberOfYears + "]";
	}
    
    public double simpleInterest() {
    	double totalAccruedAmount = (principalAmount * rateOfInterest * numberOfYears)/100; 
    	double ans = totalAccruedAmount;
    	return ans;
    }
	public double result() {
		double totalAccruedAmount = (principalAmount * rateOfInterest * numberOfYears)/100;
    	double ans = totalAccruedAmount;
		return ans;
	}
}
