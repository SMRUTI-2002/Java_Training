package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentIdMain {
	
	public static void main(String[] args) {
        Agent agent = new Agent();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Agent Name: ");
        agent.setName(sc.nextLine());

        System.out.println("Enter City: ");
        agent.setCity(sc.nextLine());

        System.out.println("Enter Gender: ");
        agent.setGender(sc.nextLine());

        System.out.println("Enter Marital Status: ");
        agent.setMaritalStatus(sc.nextLine());

        System.out.println("Enter Premium: ");
        agent.setPremium(sc.nextDouble());

        AgentDAO dao = new AgentDAOImpl(); // You should have a class implementing AgentDAO
        try {
            System.out.println(dao.createAgentDao(agent));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
