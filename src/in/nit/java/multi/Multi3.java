package in.nit.java.multi;


class mythread extends Thread{
	
	public void start() {
		System.out.println("from normal start");
	
	}
public void run() {
	System.out.println("from run");
}
}
public class Multi3 {

	public static void main(String[] args) {
		// we can place our start() ,normal method call
		//it is called ovverridde method
		mythread t=new mythread();
		t.start();  //from normal start
		//it is not recomended
		t.run();
	}

}
