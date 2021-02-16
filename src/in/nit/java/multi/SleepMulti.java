package in.nit.java.multi;

public class SleepMulti {

	public static void main(String[] args) throws InterruptedException {
		// if thread dont want to perform operation a particular time
		//then we should go for sleep meyhod
		//constructor****
		//sleep(ms),sleep(ms,ns)
		for(int i=0;i<5;i++) {
			System.out.println("slide"+i);
			Thread.sleep(2000);
			
			//realtime example is photo slide 2 sec gafe
			//a thread can interupt a sleeping thread,join(wait) thread
			//by using  interpt() of thread class
		}

	}

}
