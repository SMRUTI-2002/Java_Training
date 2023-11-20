package com.java.agent;

import java.util.Scanner;

import com.java.infinite.Employ;
import com.java.infinite.EmployDAO;
import com.java.infinite.EmployDAOImpl;

public class AgentSearchMain {
	
	public static void main(String[] args) {
		int agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id");
		agentid = sc.nextInt();
		AgentDAO dao = new AgentDAOImpl();
		Agent agent = dao.searchAgentDao(agentid);
		if (agent!=null) {
			System.out.println(agent);
		}
	}

}
