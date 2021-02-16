package in.nit.java.multi;


class MYRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("from run");
		
	}
	
}
public class caseStudymyRunable6 {

	public static void main(String[] args) {
		MYRunnable r=new MYRunnable();
		Thread t1 =new Thread();
		Thread t2=new Thread(r);
		//case -1	t1.start();// create thread,xcuting,empty  method like normal
		t1.run(); //same thread using,thread class run () exe like normal method
		t2.start();//new thread create,exe my runable run() exe
		t2.run();//explicitly calling //no thread exe,like normal exe run()
		//r.stop();//myruunable class doesnot have
		r.run();//no thread will create myrunnble method wll exe like normal
		System.out.println("main");
		
		//two ways we can define thread  
		//recomend is implemets runnable interface(memory level performance is good)
		//in thread base, we lose inheritance benifit	
		}

}
