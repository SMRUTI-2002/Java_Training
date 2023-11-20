package com.java.jsp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AgentDAOImpl implements AgentDAO{
	
	Connection connection;
	PreparedStatement pst;
	@Override
	public List<Agent> showAgentDao() throws ClassNotFoundException, SQLException {
		connection = AgentConnectionHelper.getConnection();
		String cmd = "Select * from Agent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Agent> agentList = new  ArrayList<Agent>();
		Agent agent = null;
		while(rs.next()) {
			agent = new Agent();
			agent.setAgentId(rs.getInt("agentId"));
			agent.setName(rs.getString("name"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getDouble("premium"));
			agentList.add(agent);
		}
		return agentList;
	}
	@Override
	public String createAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
		connection = AgentConnectionHelper.getConnection();
		String cmd = "Insert into agent (Name,City,Gender,MaritalStatus,Premium) values (?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
	    pst.setString(1, agent.getName());
	    pst.setString(2, agent.getCity());
	    pst.setString(3, agent.getGender().toString());
	    pst.setInt(4, agent.getMaritalStatus());
	    pst.setDouble(5, agent.getPremium());
	    pst.executeUpdate();
	    
		
		return "Record inserted";
	}
	@Override
	public Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		connection = AgentConnectionHelper.getConnection();
		String cmd = "Select * from Agent where agentId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentId);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if(rs.next()) {
			agent = new Agent();
			agent.setAgentId(rs.getInt("agentId"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getDouble("premium"));
		}
		return agent;
	}
	@Override
	public String deleteAgentDao(int empno) throws ClassNotFoundException, SQLException {
		Agent agent = searchAgentDao(empno);
		if(agent != null) {
			connection = AgentConnectionHelper.getConnection();
			String cmd = "Delete from Agent where agentId = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Employ record deleted";
		}
		
		return "Employ record not found";
	}
	@Override
	public String updateAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
		Agent agentFound = searchAgentDao(agent.getAgentId());
		if(agentFound != null) {
			connection = AgentConnectionHelper.getConnection();
			String cmd = "Update agent set name = ?, city = ?, gender = ?, maritalstatus = ?, premium = ?"
					+ "where agentId = ?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, agent.getName());
			pst.setString(2, agent.getCity());
		    pst.setString(3, agent.getGender().toString());
		    pst.setInt(4, agent.getMaritalStatus());
		    pst.setDouble(5, agent.getPremium());
		    pst.setInt(6, agent.getAgentId());
		    pst.executeUpdate();
		    return "Employ record updated";
		}
		return "Employ record not found";
	}
	
	

}