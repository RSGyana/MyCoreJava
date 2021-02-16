package in.nit.java.multi;

class MYthread2 extends Thread{

	public void start() {
		super.start();
		System.out.println("from normal start");

	}

	public void run() {
		System.out.println("from run");
	}

}
public class Multi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MYthread2 t=new MYthread2();
		t.start(); 
		System.out.println("from main");
		//three possible of o/p
	//	from normal start
		//from main
		//from run

	}

}
