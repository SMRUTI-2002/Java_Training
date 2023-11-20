package com.java.agent;

import java.sql.SQLException;

public class ShowAgentMain {
	
	public static void main(String[] args) {

        AgentDAO dao = new AgentDAOImpl();

        try {

            dao.showAgentDao();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();

        }

    }

}
