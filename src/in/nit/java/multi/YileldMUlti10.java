package in.nit.java.multi;
class myhread6 extends Thread{
	public void run() {
		System.out.println("child thread");
		Thread.yield();
	}
}

public class YileldMUlti10 {

	public static void main(String[] args) {
		// to pass current thread ecxecution thread to give the chance to wait for same priority
		//if the not waiting thread is not there,or low priority
		//then same thread excuted
		//if multiple thread are waiting same priority we cant expect which will executed deppends upen threadsceduler
		//the thread which is yielded we cant predict when will get chance for scedule
		
		
		//in thread life when yield method will presence
		               //   yield()
		//runnable state--------->running state
		
		//some platform wont support yield()
		myhread6 t=new myhread6();
		t.start();
		for(int i=0;i<5;i++)
  System.out.println("main method"); //main thread will get chance more time bcz child yield()
	}

}
