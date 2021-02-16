package in.nit.java.Staa;

public class StaticblockTest {
	//while class loading into jvm if we want perform some task then we should go for 
	//static block(it is executed from top to buttom)
	//rules
	//==static component will search and define 
	//==initialize and excute static block top to buttom
	//then main method
	
	static {
		System.out.println("welcome to static block");
		System.exit(0);//this line means after printing static block 
		//information program will be terminated otherwise error will come
	}
	//without writing main method and static block can we print data ti the console
	// static int x=m1();//assigning to a var
	//test();//by constructor
	//static int x=new test();//assign obj to a var
	//from 1.7v   main method is mandatory otherwise we will get error
	

}
