package in.nit.java.multi;


class Mythhread extends Thread{
	public void run() {
		System.out.println("no arg  method");
	}
	
	public void run(int i) {
		System.out.println(" arg  method");
	}
}


public class MultiOverloaded2 {
	
	//overloading of run()
	  //it is possible ,but thread cls start() invoke no arg method,
	   //arg method we will explicitly call

	
	public static void main(String[] args) {
		Mythhread t=new Mythhread();
		t.start();  //no arg  method
		t.run(1);  // arg  method
		
		//IT IS HIGHLY RECOMENDE TO OVERRIDE METHOD ITHERWISE DONT USE MULTITHREADING
		
	}
}
