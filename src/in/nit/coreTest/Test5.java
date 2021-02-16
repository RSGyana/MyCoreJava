package in.nit.coreTest;

//static block will exe when class will load to the jvm (exe one time bcz  class load one time)
//instance block will exe at the time of obj creation //obj creation=instance block exe


public class Test5 {
	static{
		System.out.println("static  block");
	}
	{
		System.out.println("from instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t=new Test5();
		Test5 t1=new Test5();
		Test5 t2=new Test5();

	}

}
