package in.nit.java.multi;

import java.util.concurrent.locks.ReentrantLock;

public class Multi23 {

	public static void main(String[] args) {
		// trylock=if obj not lock,
            //it wont wait,it  will exe else part,
		
	mythreadf t=new mythreadf("fst thread");
	mythreadf t1=new mythreadf("sec thread");
	t.start();
	t1.start();
	}

}
class mythreadf extends Thread{
	static ReentrantLock l=new ReentrantLock();
	public mythreadf(String name) {
		super(name);
	} 
	
	public void run() {
	
		if(l.tryLock()) {
		System.out.println(Thread.currentThread().getName()+"--getting lock and perform safe oprn");
			try {Thread.sleep(2000);
				
			} 
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+"--not getting lock perform unsafe oprn");
		}
	}
}
