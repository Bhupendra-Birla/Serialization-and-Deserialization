package com.kodewala.employee;

import java.io.Serializable;

public class Employee implements Serializable {
	
	int eId;
	String eName;
	transient double eSalary;
	 String eDepartment;
	 transient String ePassword;
	 //compiler will generate automatically even you not written
//	 private static final long serialVersionUID =1L;
	public Employee(int eId, String eName, double eSalary, String eDepartment, String ePassword) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDepartment = eDepartment;
		this.ePassword = ePassword;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	
	
}
