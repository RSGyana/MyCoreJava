package in.nit.java.multi;


//if will not declare wish () synch then w will get irregular o/p
//otherwise only one thread will execute at a time reg o/p
class Display{
	public synchronized void wish(String name) {
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
class Mythread15 extends Thread{
	Display d;
	String name;
	public Mythread15(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
		}
	}


public class synchronizationmulti15 {

	public static void main(String[] args) {
		// synchronizer is a modifier aplicable for only methods and blocks
		//if multiple threads try to operate same obj then data inconsitency problemm
		//to overcome we use synchronized
		//at a time one thread can allowed to method /block 
		//adv==data inconsitency
		//disadv=it increases waiting time of threads performance reduces
		//internaly sync implement by lock
		//when ever we using synchro keywordb then lock concept come
		//if a thread wants to get synchronized method,at a time one thread can access after release
		//all operation release/accept vby jvm not by prog
		//while a thread executing a sync method ,other sync method cant execute same obj
		//but other non-sync method  can execute that time
		//lock concept is impl based on obj but not method
		//sync area obj state can be change(upadte,delete)
		//non-sync area obj state can't be change(read)

		//class checkavail{}

		//non// public void cahekseat() {}
		// synchronized public void bookseat(){}		
     Display d=new Display();
     Mythread15 t1=new Mythread15(d,"dhomi");
     Mythread15 t2=new Mythread15(d,"yuvi");
     Mythread15 t3=new Mythread15(d,"ghom");
     t1.start();
     t2.start();
     t3.start();
     


	}

}

//if multiple thread operates  on same obj then sync is required
//ex==jointaccount  in bank
//if multiple thread operates  on multi  obj then sync is not required
//two obj if we take what is the use of sync
//Display d1=new Display();
//Display d2=new Display();

//sync based on obj not on method

//to overcome from this problem declare static then obj willl  create at a one obj can access




















