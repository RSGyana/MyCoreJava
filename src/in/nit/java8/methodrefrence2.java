package in.nit.java8;

import in.nit.java.multi.threadLifecycl;

//non-static method
//test t=new test();
  //t.m1;
public class methodrefrence2 {
	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("from child thread");
		}
	}

	public static void main(String[] args) {
		
		methodrefrence2 m=new methodrefrence2();
		Runnable r=m::m1; //non =static method invocation
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("from main thread");
		}
		

	}

}
