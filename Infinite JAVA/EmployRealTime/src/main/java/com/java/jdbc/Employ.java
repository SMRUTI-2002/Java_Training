package com.java.jdbc;

public class Employ {
	private int empno;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private Double basic;
	public int getEmpno() {
		return empno;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public String getName() {
		return name;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}
	public Employ(int empno, String name, Gender gender, String dept, String desig, Double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	public Employ() {
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
    
}
