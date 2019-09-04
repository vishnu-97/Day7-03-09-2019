package com.thread;

public class EmployeeRunnableThread implements Runnable{
	Employee e;
	float hra,ca,da;
	public EmployeeRunnableThread(int eno,String ename,int basicSal) {
		e=new Employee(eno, ename, basicSal);
	}
	
	public void run() {
		hra=(float) ((10.0/100)*e.getBasicSalary());
		da=(float) ((25.0/100)*e.getBasicSalary());
		ca=(float) ((10.0/100)*e.getBasicSalary());
		System.out.println(e+" hra="+hra
				+ "  da="+da
				+ "ca="+ca);
	}
	
}
