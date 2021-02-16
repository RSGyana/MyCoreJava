package in.nit.java.multi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class multi24 {

	public static void main(String[] args) {
		// trylock=if obj not lock,
            //it  wait for a prticular time after that will get lock,
		//then it  will exe ,
		
	mythreadg t=new mythreadg("fst thread");
	mythreadg t1=new mythreadg("sec thread");
	t.start();
	t1.start();
	}

}
class mythreadg extends Thread{
	static ReentrantLock l=new ReentrantLock();
	public mythreadg(String name) {
		super(name);
	} 
	
	public void run() {
		do {
			
			try {
				if (l.tryLock(5000,TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+"--got lock ");
					Thread.sleep(20000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"--release the lock");
				break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+"--unable to get lock wait");
				}
				
			} 
			catch (Exception e) {
				// TODO: handle exception
			}
			
		} while (true);
		
	
}
	}