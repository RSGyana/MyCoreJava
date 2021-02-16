package in.nit.java.multi;

public class threadLifecycl {

	public static void main(String[] args) {
		 //        start()------>allow to process   -->run()
		// new/born------->ready/runnable----->running-------->dead()
	
	//after starting a threa if we want again same thread we will get rror
	// illegalstateofexception
		Thread t=new Thread();
		t.start();
		System.out.println("main thread");
		t.start();//java.lang.IllegalThreadStateException
		}

}
