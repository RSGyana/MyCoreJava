package in.nit.coreTest;

//string to int conversion

public class Test6 {

	
	 static String s="5";
	static String x="20";
	//it will not converted to integerer so we throw excption
	//static String x="aaa";


	
	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(s);
			int b=Integer.parseInt(x);
			System.out.println("the addn is \t"+(a+b));
			
		

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    
     	}

}
