package com.java.ejb;

public class PatientReport {
	
	    private int reportId;
	    private String pid;
	    private String testCode;
	    private String testName;
	    private String testDescription;
	    private double cost;
	    private String comments;
		public int getReportId() {
			return reportId;
		}
		public void setReportId(int reportId) {
			this.reportId = reportId;
		}
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public String getTestCode() {
			return testCode;
		}
		public void setTestCode(String testCode) {
			this.testCode = testCode;
		}
		public String getTestName() {
			return testName;
		}
		public void setTestName(String testName) {
			this.testName = testName;
		}
		public String getTestDescription() {
			return testDescription;
		}
		public void setTestDescription(String testDescription) {
			this.testDescription = testDescription;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		public PatientReport(int reportId, String pid, String testCode, String testName, String testDescription,
				double cost, String comments) {
			super();
			this.reportId = reportId;
			this.pid = pid;
			this.testCode = testCode;
			this.testName = testName;
			this.testDescription = testDescription;
			this.cost = cost;
			this.comments = comments;
		}
		public PatientReport() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "PatientReport [reportId=" + reportId + ", pid=" + pid + ", testCode=" + testCode + ", testName="
					+ testName + ", testDescription=" + testDescription + ", cost=" + cost + ", comments=" + comments
					+ "]";
		}
	
}
