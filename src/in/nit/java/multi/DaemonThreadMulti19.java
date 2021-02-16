package in.nit.java.multi;

class Threada extends Thread{}
public class DaemonThreadMulti19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// those threads are executing it the background is daemon thread
		//gc,signal dispathcher,attach listner
		//the mainn objective of daemon thread to rovide support to non-daemoon thread
		//(main thread for ex==if main thread run less memory ,that time background will run and free memory will allocate to main thread)
		 	//usuall daemon thread low priority,sometime run with high priority

		//we can check daemon nature of a thread by using isdaemon() method
		//we can change by using setdaemon(),before stopinng starting thread we can change
		//other wise we will get illegalstateexception 
		
		//default nature************
		//main thread is non-daemon for all daemon nature will be inherited
		//if parent daemon child also daemon, same for non daemon thread
		
		//it is imposible to change daemon nature of main thread
		//bcz it is already satarted by jvm from begning
		
		
		
		
		System.out.println(Thread.currentThread().isDaemon());//false
		//Thread.currentThread().setDaemon(true);//IllegalThreadStateException
		Threada t=new  Threada();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());//true
	}

}
