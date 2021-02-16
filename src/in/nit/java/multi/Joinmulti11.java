package in.nit.java.multi;

class myThread8 extends Thread{
	static Thread mt;
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("welcome to child");
		try {
			mt.join();
			//Thread.sleep(1000);	
			} 
		catch (InterruptedException e) {
			
		}
		}
	}
}
public class Joinmulti11 {
	
//in this prog main thread wait for child thread completion
	public static void main(String[] args) throws InterruptedException{
		// if a thread wants to complete some other thread fst
		//then we should go for join method
		//if t1 is wait for t2 mean
		
		//ex==fst t2 will complete after that t1 start process
		//every join method  throws interpetdEception(chkd excepn)
     //public void join() throws inturptedException
     //public void join(long ms);throws inturptedException
    // public void join(long ms,long ns)throws inturptedException
		//if we will write join method to a thread then the thread enter into
		//wait state,after complte thats thread it will again goes to runnable    then running state
	
		myThread8 t=new myThread8();
		myThread8.mt=Thread.currentThread();
		t.start();
		t.join();//it means after executing child thread main thread will execute
		//t.join(10000);//main thread will wait for 10 sec after that executee wheather child is cmplete or not
		for(int i=0;i<3;i++) {
			System.out.println("main");
	
		}
	
	}

}
