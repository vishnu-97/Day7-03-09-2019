package com.thread;

public class Employee {
	int eno,basicSalary;
	String ename;
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Employee(int eno, String ename, int basicSalary) {
		this.eno = eno;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", basicSalary=" + basicSalary + ", ename=" + ename + "]";
	}
	
	
	
	
} 
