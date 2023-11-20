package com.java.hms;

import java.util.List;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class RoomDAOImpl implements RoomDao{
	
	 SessionFactory sf;
	    Session session;

	@Override
	public List<Room> showRoomsDao() {
		sf = SessionHelper.getConnection();
        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        session = sf.openSession();
        Criteria criteria = session.createCriteria(Room.class);
        List<Room> roomList = criteria.list();
        sessionMap.put("roomList", roomList);
        return roomList;
	}

}
