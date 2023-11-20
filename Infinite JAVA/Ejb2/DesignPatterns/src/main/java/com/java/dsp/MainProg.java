package com.java.dsp;

public class MainProg {
	
	public static void main(String[] args) {
		String topic ="java";
		AbstractFactory factory = new TrainingFactory();
		Training result= factory.getdetails(topic);
		System.out.println(result.getTrainingDetails());
	}

}
