package in.nit.java.multi;
class Threadb extends Thread {
	int total=0;
	public void run() {
		synchronized (this) {

			for(int i=0;i<5;i++) {
				total=total+i;
			}
			System.out.println("form child thread notifiaction will come");
			this.notify();
			System.out.println("child thread giving notifications");
		}

	}
}

	public class InterthreadcommMulti18 {

		public static void main(String[] args) throws InterruptedException {
			//two threads can comm by  wait(),notify,notifyall()
			// wait(),notify,notifyall all are present in object class
			//bcz thread can call this method any java obj
			//to call wait(),notify,notifyall() on any obj thread should owner of thart obj that means 
			//has lock//or should be present in sync area
			//wait(),notify,notifyall() ony we call from sync area
			//otherwisse we will get illegalstatemonitorExecption

			//if a thread calls on any immediately realease the particular obj
			//enter into waiting state

			//if a threads calls notify() any obj release the lock not immediately
			//except this three methods there is no other where thread releasse lock

			Threadb t=new Threadb();
			t.start();
			Thread.sleep(10000);//worst situation child complete the task main after wake waiting but not response
			synchronized (t){
				System.out.println("main thrraead is going to waiting state");
				t.wait(10000);//solution sleep is provide informn to wait
				System.out.println("main thread got nottification");
			}
			System.out.println("the total is======="+t.total);

		}

	}
//the formula is (n(n-1))/2
	
	//diff b/w notify and notifyall()
	//we can use notify to give notifiaction to one thread ,if mutliple thread is there
	//then one thread will get  notification,other are wait for again notification
	//which thread will notify jvm will decide
	//one line we r usng to give notfcn to multiple threads
	
	//ex stack s1=new stack(),stack s2-new stack();
	//suppose we lock s1 ,we should call s1/if we will call s2 then we will get exception
	//illegalmonotorexception
	
	//notifyAll() //we sre using notifyall() to all threads will notify related to that obj(spec)
	//even though multiple thread will notify,but one by one exe
	//thread need lock thats why one by one