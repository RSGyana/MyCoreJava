package in.nit.java.multi;
class mythread5 extends Thread{
	public void run() {
		for(int i=0;i<7;i++)
		System.out.println("from child");
	}
}

public class threadPriority9 {

	public static void main(String[] args) {
		mythread5 t=new mythread5();
		t.setPriority(7);
		t.start();
		
		for(int i=0;i<5;i++)
			System.out.println("main thread");
		
		//actually we should get fst child thread after main thread,
		//but we are getting viceversa o/p
		//bcz all platform not supporting multi threading properly

	}

}
