package in.nit.java.multi;
class mythread4 extends Thread{}
public class ThreadpriorityMulti8 {

	public static void main(String[] args) {
		// priority 1-10 (valid)not 0-10
		//min-1,max-10,norm=5
		//every thread on java have some priority,may generate by jvm or provide by prog
		//thread schdeuler will use priority to scehdule fst
		//those thread have high priority fst
		//if two thread have same  priority then we cant predict
		//setpriority(),setpriority() are two method of thread class
		//public final void setpriority(int p)//max 10 allowed
		//default prority only for main 5
		//rest thread default priority will be inherited from parent to child(p=c)
  System.out.println(Thread.currentThread().getPriority());//5
		//Thread.currentThread().setPriority(12);//IllegalArgumentException
		
		
		Thread.currentThread().setPriority(6);
		mythread4 t=new mythread4();
	  System.out.println(t.getPriority());

		
		
		
		

	}

}
