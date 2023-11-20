package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAgentMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Agent ID to delete: ");
        int agentId = sc.nextInt();
        AgentDAO dao = new AgentDAOImpl();
        try {
            String result = dao.deleteAgentDao(agentId);
            System.out.println(result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
