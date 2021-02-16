package in.nit.java.multi;

class MyyThread3 extends Thread{}

public class multi7 {

	public static void main(String[] args) {
		// thread class constructo 8 ways
		
//Thread t=new Thread()
		
	//	Thread t=new Thread(string name)
		
	 // Thread t=new Thread(runnable r,string name)
		// Thread t=new Thread(runnable r)
		
// Thread t=new Thread(threadgroup g,string name)
		
		//Thread t=new Thread(threadgroup g,runable r)
			
		//Thread t=new Thread(thredgroup g,runnable r,string name)
		
//Thread t=new Thread(thredgroup g,runnable r,string name,long stacksize)
	
		//default name is main by jvm
		System.out.println(Thread.currentThread().getName());//main
		//creating thread
		MyyThread3 t=new MyyThread3();
		System.out.println(t.getName());//thread-0
		//we can change thread name
		Thread.currentThread().setName("jk");
		System.out.println(Thread.currentThread().getName());//jk
		
		//we acn check thread from where executing
		//by thread.currentthread().getname
		
		
		
		
	}

}
