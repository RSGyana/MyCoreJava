package in.nit.java.multi;


//impl sync block for a current obj
class Displays{
	public  void wish(String name) {
		//if i have here 1000 lines of code
		//synchronized (this) {  //in this case take sync block***
		synchronized(Displays.class) {//class level sync
		for(int i=0;i<5;i++) {
			System.out.println("good morning:");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
  System.out.println(name);
		}
	}
		//if i have here 1000 lines of code
	}
}	
class Mythread17 extends Thread{
	Displays d;
	String name;
	public Mythread17(Displays d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
		}
	}


public class SyncBlockMulti17 {

	public static void main(String[] args) {
		// if very few lines of code need then go for sync block not sync method
		//adv==reduces waiting times of the system
		
		//we can declare sync block
		//to get lock current obj =====  synchronized(this)
		//to get lock particular obj ==  synchronized(b)
		//to get lock classl level lock  ==  synchronized(Dispal d)
		//primitive we cant lock,so we cant pass primitive as arg, eror//CE
		
		
		 Displays d1=new Displays();
         Displays d2=new Displays();
  Mythread17 t1=new Mythread17(d1,"dhomi");
  Mythread17 t2=new Mythread17(d2,"Ghomi");
 
  t1.start();
 t2.start();
		 

	}

}
