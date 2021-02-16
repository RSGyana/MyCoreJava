package in.nit.java.multi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable26 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// in the case of ruuanble job after completing prog it
		//wont return anythinng,if thread required to show then
		//but callable will return
		//that will hold by future
		//toretrieve the resullt from callable we use future
		myCallable[] jobs= {new myCallable(10),
				new myCallable(15),
				new myCallable(20),
				new myCallable(25),
				new myCallable(30),
				new myCallable(40)};
		ExecutorService service=Executors.newFixedThreadPool(3);

		for(myCallable job:jobs) {
			Future f=service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}

}
class myCallable implements Callable{
	int num;
	 public myCallable(int num) {
		this.num=num;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("thread is responsible  sum of"
				+ " "+num+"numbers");
		int sum=0;
				for(int i=0;i<=num;i++) {
					sum+=i;
					Thread.sleep(10);
				}
		
		return sum;
	}
	
}