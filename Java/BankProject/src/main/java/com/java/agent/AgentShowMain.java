package com.java.agent;

import java.sql.SQLException;
import java.util.List;

import com.java.agent.AgentDAO;
import com.java.agent.AgentDAOImpl;
import com.java.jdbc.Employ;

public class AgentShowMain {
	
	public static void main(String[] args)  {
		AgentDAO dao = new AgentDAOImpl();
		
		List<Agent> agentList;
		try {
			agentList = dao.showAgentDao();
			for(Agent agent : agentList) {
			System.out.println(agentList.size());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	

}
