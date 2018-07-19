package com.example.model;

import java.sql.Date;

public class Employee {
	private int empId;
	private String fName;
	private String lName;
	private int dptId;
	private Date hdate;
	private boolean activities;
	
	public Employee()
	{
		super();
	}

	// constructor with parameter
	public Employee(int empId, String fName, String lName, int dptId, Date hdate, boolean activities) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.dptId = dptId;
		this.hdate = hdate;
		this.activities = activities;
	}
	
	// generate getter and setter

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getDptId() {
		return dptId;
	}

	public void setDptId(int dptId) {
		this.dptId = dptId;
	}

	public Date getHdate() {
		return hdate;
	}

	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}

	public boolean isActivities() {
		return activities;
	}

	public void setActivities(boolean activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", dptId=" + dptId + ", hdate="
				+ hdate + ", activities=" + activities + "]";
	}

}
