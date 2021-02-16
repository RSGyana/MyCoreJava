package in.nit.java.multi;

class myThread12 extends Thread{
	public void run() {
	
		try {
			for(int i=0;i<5;i++) {
			System.out.println("i am lazy Thread");
			Thread.sleep(2000);
		} 
	}
		catch (InterruptedException e) {
			System.out.println("i got interupted");
		}
	}
	
} 

public class INTERUPTtHREAD13 {
	

	public static void main(String[] args) {
		// hOW CAN WE INTERUPT A THREAD BY  ANOTHRER THREAD
		myThread12 t=new myThread12();
		t.start();
		//t.interrupt(); to interrupt one thread by using another thread
		System.out.println("main thread end");
		
		//note
		//when ever we are calling interrupt () if target thread is not
		//in sleeping mode/state ,untill wait interrupt() for sleep() state
		//when see target dependent thread in sleep state call interupt()
//if the target thread is not going to wait/sleep state for infinite period
		//in case interrupt() waste
	}

}
