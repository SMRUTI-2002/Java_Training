package com.java.jsf;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AgentDAOImpl implements AgentDAO {
 	SessionFactory sf;
	Session session;
	public List<Agent> showEmployCr() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.addOrder(Order.asc("basic"));
		List<Agent> agentList = cr.list();
		return agentList;
}
	
	public Agent searchAgentCr(int agentId) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.add(Restrictions.eq("agentId", agentId));
		Agent agent = (Agent)cr.uniqueResult();
		return agent;
	}

	@Override

	public List<Agent> showAgentDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> agentList = query.list();
		return agentList;

	}

	@Override
	public String searchAgentDao(int agentId) {
		Map<String,Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
					sf = SessionHelper.getConnection();
					session = sf.openSession();
					Query query = session.createQuery("from Agent where agentId="+agentId);
					List<Agent> agentList = query.list();
					     Agent agent = agentList.get(0);
					     sessionMap.put("editAgent", agent);
					 return "UpdateAgent.xhtml?faces-redirect=true";
	}

}
