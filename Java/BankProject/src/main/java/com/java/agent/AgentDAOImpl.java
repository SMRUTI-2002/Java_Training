package com.java.agent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AgentDAOImpl implements AgentDAO{
	Connection connection;
	PreparedStatement pst;

	@Override
	public String createAgentDao(Agent agent) throws ClassNotFoundException, SQLException {

	    connection = AgentConnectionHelper.getConnection();
	    String cmd = "INSERT INTO Agent(AgentId, Name, City, Gender, MaritalStatus, Premium) VALUES(?,?,?,?,?,?)";

	    pst = connection.prepareStatement(cmd);
	    pst.setInt(1,agent.getAgentId());
	    pst.setString(2, agent.getName());
	    pst.setString(3, agent.getCity());
	    pst.setString(4, agent.getGender());
	    pst.setString(5, agent.getMaritalStatus());
	    pst.setDouble(6, agent.getPremium());

	    pst.executeUpdate();

	    return "Agent created with Agent ID " ;
	} 

	@Override
	public List<Agent> showAgentDao() throws ClassNotFoundException, SQLException {
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    try {

	        connection = AgentConnectionHelper.getConnection();
	        String query = "SELECT * FROM Agent";
	        preparedStatement = connection.prepareStatement(query);	       
	        resultSet = preparedStatement.executeQuery();
	        while (resultSet.next()) {
	            int agentId = resultSet.getInt("AgentId");
	            String name = resultSet.getString("Name");
	            String city = resultSet.getString("City");
	            String gender = resultSet.getString("Gender");
	            String maritalStatus = resultSet.getString("MaritalStatus");
	            double premium = resultSet.getDouble("Premium");
	            System.out.println("Agent ID: " + agentId);
	            System.out.println("Name: " + name);
	            System.out.println("City: " + city);
	            System.out.println("Gender: " + gender);
	            System.out.println("Marital Status: " + maritalStatus);
	            System.out.println("Premium: " + premium);
	            System.out.println();
	        }
	    } finally {

	        if (resultSet != null) {
	            resultSet.close();
	        }
	        if (preparedStatement != null) {
	            preparedStatement.close();
	        }
	        if (connection != null) {
	            connection.close();
	        }
	    }
		return null;
	}

 

	

 

	public Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException {
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    Agent agent = null;

 

	    try {

	        connection = AgentConnectionHelper.getConnection();

 

	    
	        String query = "SELECT * FROM Agent WHERE AgentId = ?";
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setInt(1, agentId);

 

	        
	        resultSet = preparedStatement.executeQuery();

 

	        if (resultSet.next()) {

	            agent = new Agent();
	            agent.setAgentId(resultSet.getInt("AgentId"));
	            agent.setName(resultSet.getString("Name"));
	            agent.setCity(resultSet.getString("City"));
	            agent.setGender(resultSet.getString("Gender"));
	            agent.setMaritalStatus(resultSet.getString("MaritalStatus"));
	            agent.setPremium(resultSet.getDouble("Premium"));
	        }
	    } finally {

	        if (resultSet != null) {
	            resultSet.close();
	        }
	        if (preparedStatement != null) {
	            preparedStatement.close();
	        }
	        if (connection != null) {
	            connection.close();
	        }
	    }

 

	    return agent;
	}

 

 

 

	@Override
	public String updateAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;

 

	    try {

	        connection = AgentConnectionHelper.getConnection();

 

	        String query = "UPDATE Agent SET Name=?, City=?, Gender=?, MaritalStatus=?, Premium=? WHERE AgentId=?";
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, agent.getName());
	        preparedStatement.setString(2, agent.getCity());
	        preparedStatement.setString(3, agent.getGender());
	        preparedStatement.setString(4, agent.getMaritalStatus());
	        preparedStatement.setDouble(5, agent.getPremium());
	        preparedStatement.setInt(6, agent.getAgentId());

 

 

	        int rowsAffected = preparedStatement.executeUpdate();

 

	        if (rowsAffected > 0) {
	            return "Agent with ID " + agent.getAgentId() + " updated successfully.";
	        } else {
	            return "Agent with ID " + agent.getAgentId() + " not found or no changes made.";
	        }
	    } finally {

	        if (preparedStatement != null) {
	            preparedStatement.close();
	        }
	        if (connection != null) {
	            connection.close();
	        }
	    }
	}

 

 

	@Override
	public String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException {
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;

 

	    try {   
	        connection = AgentConnectionHelper.getConnection(); 
	        String query = "DELETE FROM Agent WHERE AgentId=?";
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setInt(1, agentId);
	        int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
	            return "Agent with ID " + agentId + " deleted successfully.";
	        } else {
	            return "Agent with ID " + agentId + " not found or deletion failed.";
	        }
	    } finally {
	        if (preparedStatement != null) {
	            preparedStatement.close();
	        }
	        if (connection != null) {
	            connection.close();
	        }
	    }
	    
	}

}
