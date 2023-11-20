package com.java.junitdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class LeaveDetailsTest {
	private Date leaveStartDate;
	private Date leaveEndDate;
	private Date appliedOn;

	@Test
	public void testToString() {
		LeaveDetails leavedetails = new LeaveDetails();
		String result =leavedetails.toString();
		assertNotNull(result,"toString() should return a no-null string");
	}
	
	@Test
	public void testConstructor() throws ParseException {
		LeaveDetails leavedetails = new LeaveDetails();
		assertNotNull(leavedetails);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Date leaveStartDate =sdf.parse("2023-09-14");
		 Date leaveEndDate = sdf.parse("2023-09-17");
		 Date appliedOn = sdf.parse("2023-09-13");
		 Date actualDate = sdf.parse("2023-09-14");
		 Date actualDate2 = sdf.parse("2023-09-17");
		 Date actualDate3 = sdf.parse("2023-09-13");		
    	 LeaveDetails leave = new LeaveDetails(1,1033217,"smruti",leaveStartDate,leaveEndDate,LeaveStatus.ACCEPTED,LeaveType.EL,"sick","yes",appliedOn);
    	 assertEquals(1, leave.getLeaveId());
    	 assertEquals(1033217,leave.getEmpId());
		 assertEquals("smruti", leave.getEmpName());
		 assertEquals(leaveStartDate, actualDate);
		 assertEquals(leaveEndDate, actualDate2);
		 assertEquals(LeaveStatus.ACCEPTED, leave.getLeaveStatus());
		 assertEquals(LeaveType.EL, leave.getLeaveType());
		 assertEquals("sick", leave.getLeaveReason());
		 assertEquals("yes", leave.getManagerComments());
		 assertEquals(appliedOn, actualDate3);

		
	}
}
			
					
 




	

