package in.nit.java.exception;

public class ThrowTest extends RuntimeException {
	//throw
	// to main role  of throw keyword manual crete exception to handover to jvm
	//throw new arithmatic("/ div by 0");
	  
	//  case==1
	 //  throw e if e will ref value is null then we will get npe
	
	
	static ArithmeticException e=new ArithmeticException();//arith matic excpn
	//static ArithmeticException e;//null pointer excepn
	public static void main(String[] args) {
		throw e;
		
		//case ==2
		//after write throw line we vant write any other statenment line
  //we will get unreachable error
		
		//cae==3 we can use throw for only throwable type
		//oyherwise we will get incompartible error
	//public static void main(String[] args) {
  // throw new ThrowTest();//an exception type must be a subclass of Throwable


/*//case ==4 extends from runtimeException
	public static void main(String[] args) {
		
		throw new ThrowTest();//Exception in thread "main" 
*/
   
   
   //throws===*************
   //to delegate resposibilty ti calleer that method/jvm
   
   //it is only used in chkd excpn  by using throws 
	//it is recomended to use try-catch over throws keyword
   //throws keyword used for method level and constructor level not class level
   //we can use throws key for throwable calses
   //if we will use other classes then will found error
	
	/*
	 * public void m1()throws ThrowTest{
	 * 
	 * } //we will get incompartible error //found test required throwab;e type
	 */	 
	/*public static void main(String[] args) {
		
		
   
	}

*/}
}