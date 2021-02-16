package in.nit.java.multi;

import java.util.concurrent.locks.ReentrantLock;

class DisplayT{
	ReentrantLock l=new ReentrantLock();

	public void wish(String name) {
		l.lock();//comment this line and see
		for(int i=0;i<5;i++) {
			System.out.println("good morning:");

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);

		}
		l.unlock(); //comment this line se what  is the output
	}
}	
class Mythreade extends Thread{
	DisplayT d;
	String name;
	public Mythreade(DisplayT d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}


public class ReentrantLockMulti22 {

	public static void main(String[] args) {
		DisplayT d=new DisplayT();
		Mythreade t1=new Mythreade(d,"jk");
		Mythreade t2=new Mythreade(d, "dk");
		Mythreade t3=new Mythreade(d, "sk");
		t1.start();
		t2.start();
		t3.start();

	}

}
