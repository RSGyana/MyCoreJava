package in.nit.coreTest;
//print the default vallue by declare class level static or instance

public class Test4 {
 
	 int x=10;
  float y;
 static boolean z;
 static char a;
 

	public static void main(String[] args) {
		Test4 t=new Test4();
		
		  System.out.println("the default value of int \t"+t.x);
		  System.out.println("the default value of float \t"+t.y);
		  System.out.println("the default value of booleanis \t"+z);
		  System.out.println("the default value of cahr is \t"+a);
		 
	}

}
