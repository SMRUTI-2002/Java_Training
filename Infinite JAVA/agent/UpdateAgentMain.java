package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAgentMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 

  
        System.out.print("Enter Agent ID: ");
        int agentId = sc.nextInt();

 

      
        System.out.print("Enter Updated Name: ");
        String updatedName = sc.next();
        System.out.print("Enter Updated City: ");
        String updatedCity = sc.next();
        System.out.print("Enter Updated Gender: ");
        String updatedGender = sc.next();
        System.out.print("Enter Updated Marital Status: ");
        String updatedMaritalStatus = sc.next();
        System.out.print("Enter Updated Premium: ");
        double updatedPremium = sc.nextDouble();

 

        Agent updatedAgent = new Agent(agentId, updatedName, updatedCity, updatedGender, updatedMaritalStatus, updatedPremium);

 

        AgentDAO dao = new AgentDAOImpl();
        try {
            String result = dao.updateAgentDao(updatedAgent);
            System.out.println(result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
