package in.nit.java.multi;


class mythread11 extends  Thread{
	static Thread mt;
	public void run()
	{
		try {
			mt.join();
		} catch (InterruptedException e) {
		
		}
		for(int i=0;i<5;i++) {
			System.out.println("from child");
		}
	}
}
public class multiJOIn12 {

	public static void main(String[] args) throws InterruptedException {
		
		mythread11.mt=Thread.currentThread();
      //System.out.println(mythread11.mt=Thread.currentThread());
		mythread11 t=new mythread11();
		t.start();
		//t.join(); for deadlock 
		for(int i=0;i<5;i++) {
			
			System.out.println("main thread");
			Thread.sleep(2000);
		}

	}

}
//in this prog child thread will wait for main completion
//deadlock situation
//suppose main is waiting for child thread completion and 
//child also waiting for main thread completion in this both thread are in idle state
//this the dead lock situation
//if a thread calls join() of same thread ,this is also deadlock situation
//Thread.currentThread().sleep(); call in main method