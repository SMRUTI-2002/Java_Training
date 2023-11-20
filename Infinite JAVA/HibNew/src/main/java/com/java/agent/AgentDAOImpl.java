package com.java.agent;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.infinite.Employ;
import com.java.infinite.SessionHelper;

public class AgentDAOImpl implements AgentDAO {

	@Override
	public List<Agent> showAgentDAO() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> agentList = query.list();
		return agentList;
	}

	@Override
	public Agent searchAgentDao(int agentid) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent where agentid="+agentid);
		List<Agent> agentList = query.list();
		if(agentList.size()>0) {
			return agentList.get(0);
		}
		return null;
	}

}
