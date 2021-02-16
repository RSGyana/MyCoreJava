package com.mst.Test;
  
class Thtread extends Thread{
	 public void run() {
		 for(int i=0;i<5;i++) {
	   //Thread.yield();
		 System.out.println("child thread");
	 }
	
}
}
class SortManual {

	public  static void main(String[] args) throws InterruptedException {
		
		Thtread t=new Thtread();
		//Thread.currentThread().setPriority(3);
		//t.join();
		t.start();
		
		
				for(int i=0;i<5;i++) {
					
		System.out.println("main thread");
		
		}

	}

}
