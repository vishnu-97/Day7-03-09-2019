package com.thread;

public class EmployeeMain {
	public static void main(String ar[]) {
		EmployeeExtendThread e1=new EmployeeExtendThread(1,"manav",54688);
		EmployeeExtendThread e2=new EmployeeExtendThread(2,"sunny",94688);
		EmployeeExtendThread e3=new EmployeeExtendThread(3,"tanish",54688);
		EmployeeExtendThread e4=new EmployeeExtendThread(4,"anuj",54988);
		EmployeeExtendThread e5=new EmployeeExtendThread(5,"chirag",74688);
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
		try {
			e1.join();
			e2.join();
			e3.join();
			e4.join();
			e5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		EmployeeRunnableThread e6=new EmployeeRunnableThread(1,"manav",54688);
		EmployeeRunnableThread e7=new EmployeeRunnableThread(2,"sunny",94688);
		EmployeeRunnableThread e8=new EmployeeRunnableThread(3,"tanish",54688);
		EmployeeRunnableThread e9=new EmployeeRunnableThread(4,"anuj",54988);
		EmployeeRunnableThread e10=new EmployeeRunnableThread(5,"chirag",74688);
		
		Thread t1=new Thread(e6);
		Thread t2=new Thread(e7);
		Thread t3=new Thread(e8);
		Thread t4=new Thread(e9);
		Thread t5=new Thread(e10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
