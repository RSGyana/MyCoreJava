package in.nit.java.multi;


class custthread extends Thread{
	static Integer custid=0;
	private static ThreadLocal t=new ThreadLocal() {
		protected Integer initialValue() {
			return ++custid; //reandom value wil generate
		}
	};
	public custthread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"exe wuth custid"+t.get());
	}
}


public class ThreadLocal28 {

	public static void main(String[] args) {
	
custthread c1=new custthread("ghoom");
custthread c2=new custthread("room");
custthread c3=new custthread("jhoom");
c1.start();
c2.start();
c3.start();   
	}

}
