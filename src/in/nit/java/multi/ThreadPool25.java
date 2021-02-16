package in.nit.java.multi;

import java.awt.PrintJob;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myjob implements Runnable{
String name;
public myjob(String name) {
	this.name=name;
}

	public void run() {
		System.out.println(name+"--therad job started"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(name+"--release the lock"+Thread.currentThread().getName()
	);
		
		
	}
	
}

public class ThreadPool25 {

	public static void main(String[] args) {
		// to create many con memory [erformance pro
		//to overcome we threadpool
		//it launch in 1.5v also known as executable f/w
		//we can create a thread as 
		
		//while dev weverver,app server we use thread poll
		
		myjob[] jobs= {new myjob("hk"),
				new myjob("kk"),
					new myjob("vk"),
								new myjob("rk"),
										 new myjob("dk"),
				
		};
		ExecutorService service=Executors.newFixedThreadPool(1);//depends upen thread pool obj will exe
for(myjob job:jobs) {
	service.submit(job);
}
service.shutdown();
	}

}
