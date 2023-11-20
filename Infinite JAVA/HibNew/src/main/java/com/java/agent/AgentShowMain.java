package com.java.agent;

import java.util.List;

import com.java.infinite.Employ;
import com.java.infinite.EmployDAO;
import com.java.infinite.EmployDAOImpl;

public class AgentShowMain {
	
	public static void main(String[] args) {
		AgentDAO dao = new AgentDAOImpl();
		List<Agent> agentList = dao. showAgentDAO();
		for(Agent agent :agentList) {
			System.out.println(agent);
		}
	}

}
