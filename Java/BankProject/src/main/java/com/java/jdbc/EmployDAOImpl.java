package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAOImpl implements EmployDAO{
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Employ> showEmployDAO() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("Desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
			
		}
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("Desig"));
			employ.setBasic(rs.getDouble("basic"));
			
			
	}
		return employ;
		
	}

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ (Empno,name,gender,dept,desig,basic)"+"values(?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(cmd);
		
			pst.setInt(1,employ.getEmpno());
			pst.setString(2,employ.getName());
			pst.setString(3,employ.getGender().toString());
			pst.setString(4,employ.getDept());
			pst.setString(5,employ.getDesig());
			pst.setDouble(6,employ.getBasic());
			pst.executeUpdate();
			return"Employ record Inserted";

	}

	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		Employ employ = searchEmployDao(empno);
		if(employ!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return"Employ Record Deleted";
		}
		return"Employ No Not Found";
	}

	@Override
	public String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if(employFound!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Update Employ set Name=?,Gender=?,Dept=?,Desig=?,Basic=? where "+ "Empno=?";
			pst = connection.prepareStatement(cmd);

			pst.setInt(1,employNew.getEmpno());
			pst.setString(2,employNew.getName());
			pst.setString(3,employNew.getGender().toString());
			pst.setString(4,employNew.getDept());
			pst.setString(5,employNew.getDesig());
			pst.setDouble(6,employNew.getBasic());
			pst.executeUpdate();
			return"Employ Record Updated";
		}
		return"Employ No Not Found";
	}
	

	
		
	
}
