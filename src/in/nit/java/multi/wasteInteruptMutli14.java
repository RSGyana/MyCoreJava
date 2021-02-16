package in.nit.java.multi;
//in this interrupt() will not work,bcz target thread not waiting/sleep state
class myThread13 extends Thread{
	public void run() {
		for(int i=0;i<45;i++) {
			System.out.println("i am not lazy"+i);
		}
		
	
		try {
		
			System.out.println("i am lazy Thread");
			Thread.sleep(2000);
		 
	}
		catch (InterruptedException e) {
			System.out.println("i got interupted");
		}
	}
	
} 

public class wasteInteruptMutli14 {
	public static void main(String[] args) {
		// hOW CAN WE INTERUPT A THREAD BY  ANOTHRER THREAD
		myThread13 t=new myThread13();
		t.start();
		t.interrupt();// to interrupt one thread by using another thread
		System.out.println("main thread end");
		
		//note
		//when ever we are calling interrupt () if target thread is not
		//in sleeping mode/state ,untill wait interrupt() for sleep() state
		//when see target dependent thread in sleep state call interupt()
//if the target thread is not going to wait/sleep state for infinite period
		//in case interrupt() waste
	}


}


