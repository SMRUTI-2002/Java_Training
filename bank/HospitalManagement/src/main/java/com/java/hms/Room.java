package com.java.hms;

public class Room {
	
	  private String roomno;
	  private String roomtype;
	  private String status;
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Room(String roomno, String roomtype, String status) {
		super();
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.status = status;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Room [roomno=" + roomno + ", roomtype=" + roomtype + ", status=" + status + "]";
	}
	      
	
      
}
