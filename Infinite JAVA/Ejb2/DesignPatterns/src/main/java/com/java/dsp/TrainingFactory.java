package com.java.dsp;

public class TrainingFactory extends AbstractFactory{

	@Override
	public Training getDetails(String topic) {
		 if (topic.equals("java")){
			       return new JavaTraining();
			       
			     }
			      if (topic.equals("Dotnet")){
			       return new DotnetTraining();
			        
			      }
			      if (topic.equals("React")){
			        return new ReactTraining();
			        
			      }
			      return null;
	}
}
