package in.nit.java.multi;


//we use class level staic sync method

class DisplayN{
	public static synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("good morning:");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
  System.out.println(name);
		
	}
	}
}	
class Mythread16 extends Thread{
	DisplayN d;
	String name;
	public Mythread16(DisplayN d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
		}
	}

public class classlevelLockMutli16 {

	public static void main(String[] args) {
		// class level lock
		//if a thread static sync method then thread want class level lock]
		//then gooing to execute class level lock,then it is execute any static sync methdod of that class 
		//after exe method release the lock 

		//WHILE A THREAD EXE STATIC SYNC METHDO,THE REM THREADS ARE NOT STATIC SYNC METHOD OF THAT CLASS SIMUL
		//BUT REM THREADS CAN EXE SIMULSTANOUSLY
		//NORMAL INSTANCE ,STATIC METHOD, SYN INSTANCE METHOD
		 
		  DisplayN d1=new DisplayN();
          DisplayN d2=new DisplayN();
   Mythread16 t1=new Mythread16(d1,"dhomi");
   Mythread16 t2=new Mythread16(d2,"Ghomi");
  
   t1.start();
   t2.start();
		 
		 
		
		
	}

}



//if will not declare wish () synch then w will get irregular o/p
//otherwise only one thread will execute at a time reg o/p


/*class DisplayN{
	public  synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("good morning:");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
  System.out.println(name);
		
	}
	}
}	
class Mythread16 extends Thread{
	DisplayN d;
	String name;
	public Mythread16(DisplayN d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
		}
	}


public class classlevelLockMutli16 {

	public static void main(String[] args) {

		

		
		
           DisplayN d1=new DisplayN();
          DisplayN d2=new DisplayN();
   Mythread16 t1=new Mythread16(d1,"dhomi");
   Mythread16 t2=new Mythread16(d2,"Ghomi");
  
   t1.start();
   t2.start();
  
   //IN THIS WE WONT SYNC METHOD/OR TAKE STATIC SYNC METHOD
   


	}

}

*/

















