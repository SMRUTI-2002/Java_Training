package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAgentMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 

      
        System.out.print("Enter Agent ID to search: ");
        int agentId = sc.nextInt();

 

        AgentDAO dao = new AgentDAOImpl();
        try {
            Agent agent = dao.searchAgentDao(agentId);
            if (agent != null) {
                System.out.println("\nAgent Information:");
                System.out.print(" Agent ID : " + agent.getAgentId());
                System.out.print(" Name: " + agent.getName());
                System.out.print(" City: " + agent.getCity());
                System.out.print(" Gender: " + agent.getGender());
                System.out.print(" Marital Status: " + agent.getMaritalStatus());
                System.out.print(" Premium: " + agent.getPremium());
            } else {
                System.out.println("\nAgent with ID " + agentId + " not found.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
