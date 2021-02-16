package in.nit.java.multi;

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("from run");
		
	}
	
}

public class multi5ImplRuunable {

	public static void main(String[] args) {
		// we can define thread by implementing runnable interface
		//it is present in java.lang   , one method run()
		MyRunnable1 r=new MyRunnable1();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<7;i++)
			System.out.println("from main thread");
		
				

	}

}
