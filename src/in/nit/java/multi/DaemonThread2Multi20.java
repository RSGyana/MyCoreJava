package in.nit.java.multi;


class Threadc extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("from  child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

public class DaemonThread2Multi20 {

	public static void main(String[] args) {
		//when ever last non daemon thread terminated.
				//automatically all daemon thread will be terminated
System.out.println("manin thread satrt");
System.out.println(Thread.currentThread().isDaemon());
//Thread.currentThread().setDaemon(true);//IllegalThreadStateException

		Threadc t=new Threadc();
		Thread t1=new Threadc();
		t.setDaemon(true);  //this will make daemon thread 
		t.start();
	    t1.start();
		System.out.println("end of main thread");
		
		
	}

}


