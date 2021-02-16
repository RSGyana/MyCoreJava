package in.nit.java.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//an unexpected/ unwanted event/ problem will create IN OUR PROGRAME/STOP OUR PROGRAME EXECUTION FLOW then IT is called exception,like 
	//like tyre pumpture,slepting exeception,power gone exception
		//exception handling
		
	// 		smooth termintaion,gracefull termination
	//THE EXCEPTION HANDLING MEANS WITHOUT ABNORMAL TERMINATION OF PROGRAME
//WITHOUT DISTURBINNG A PROGRMAE IF WE WILL CONTINUE REST OF PROGRAME IS CALLED EXCEPTION HANMDLING
		//RUNTIME MECHANISM======
		//FOR EVRY THREAD JVM WILL CREATE STACK
		//EVERY METHOD WIL STORE IN STACK FRAME
		//STACK FRAME
		//AFTER CALLLING ALL METHODS CALLS THE STACK WILL BE EMPTY,IT DESTROY BOFORE TERMINATING THREAD
		//INSIDE A METHOD ANY EXCEPTION WILL ARISE METHOD IS RESPONSIBLE TO CREATE INFORMTION ABOUT THAT OBJ  EXCPTION DEATILS
		//METHODS HANDOVER THAT OBJ TO JVM ,JVM WILL CHECK THAT NMETHOD CONTAION EXCP CODE OR NOT,
		//IF NOT CONATION THEN JVM WILL REALEASE ABNORMALLY,OTHERWISE NORMALLY..
		//THE PROCESS WILL UNTILL REACH AT MAIN METHOD IF NOT CONTAIN ANY EXCPN CODE IN MAIN PROGRAMME TREMNTE ABNORAMALLY
	
	//EXECPTION ARCH
		//THRWOABLE CONTAIN TWO CHILD(EXCEPTION,ERROR)
		
		//EXCEPTIONS=====
		
		//EXCEPTION ARE RECOVERABLE
		//MOST OF THE TIME EXCP CAUSED BY OUR PROG FOR EX PROG REQ IS TO READ DATA FROM REMOTE FILE
		//IF REMOTE FILE IS NOT THERE WE WILL GET FILENOTFOUND  EXCP
		//WE WILL PROVIDE LOCAL FILE TO THAT PROG AND TERMINATE SMOOTHLY REST OF THE PROGRAM
//ERRORS
	//DUE TO LACK OF  SYSM RESOURCES(MEMORY)THESE ARE NOT RECOVERABLE
	//IF OUT OF MEMORY ERROR OCCURS BEING A PROG WE CANT DO ANYTHING,PROG TERMNT ABNORMALLY
		//SYSTEM PEOPLE,ADMINE WILL INCREASE THE MEMORY
		
		//EXCEPTION
		//THERE ARE DIIF EXCP
		//RUNTIME,IO,SERVLET,REMOTE,INTUERPTED CEXP
		//ERROR TYPES
		//VM ERROR(STACKOVERFLOW,OUTOF MEOMRY EXCPETION),ASSERTION ERROR,INTIALIZATION ERROR
	
	
		//THE EXCPN WHICH ARE CHKD COMPILR FOR SMOOTH TERMN OF PROG,EX==HALL TICEKT MISSING,FILENOTNNOTFOUND

	//IF WILL ANY EXPCPN RAISE THN WE SHOULD HANDLE BY TRY-CATCH,THROWS
		//the excpn whch are not chkd by not cmpiler is called runtime excpn--bomblast,arithamtic excpn
		
		//whether chkd or not every occured at runtime there is nocuur in cmpile time
		//runtime excpn and chilld and eroor and child cls are unchkd exception rest are chkd
		
		//fully chkd and partial chkd
		 //a chkd excpn is fully chkd all classes and child classes chkd ex==ioxcpn
		// a chkd excpn is partial means some of partial classes are unchekd ,ex==throwable,exception
	
	//the code whch is raise excpn is risky code we should define that code in try block
		//handlinng code in catch block
		 /*try {
			 
		 }
		 catch(exception e){
			 //handling code
		 }
		
		//throwable class define 3 methods to print the details
		//printstackTrace,getMessage(only descrpn),tostring(all these we sholud write in side catch block)
	try {
		System.out.println(10/0);
	} catch (ArithmeticException e) {
		//e.printStackTrace(); //java.lang.ArithmeticException: / by zero
		//e.toString();
		//System.out.println(e);//java.lang.ArithmeticException: / by zero
		e.getMessage();/// by zero
	}
	//the way handlng excpn /evry excpn is highly recomended to take multiple catch block
	//one try and one catch block --not good
	//one try and multiple catch block--good (recomended)
	
	//if try present with multiple catch block the order is must req
	//child to parent other wise will get compile time error
		/*
		 * try { System.out.println(10/0); } 
		 * catch (Exception e) 
		 * { // TODO: handle  //here we will get error   so not good
		 * exception } 
		 * catch (ArithmeticException e) 
		 * { // TODO: handle exception } }
		 */
	/*try {
		System.out.println(10/0);
	} catch (ArithmeticException e) {
		// TODO: handle exception                 //this is good
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	*final
	*it is modifier aplicable for class ,method,var
	*we cant override if method final in child class
	*if var final we cant modify
	*if class is final we cant write child class
	*\
	*finally
	*it is a block associated with try-catch
	for clean up code  we write finally block
	its speciality is it will excetue always of irrespective excepn raise or not, handl or not
	
	
 try {
	//risky code
} 
catch (Exception e) {
	// TODO: handling code
}
 finally {
	//clean up code
}
//FINALIZE====&*****
 * IT IS A METHOD ALWAYS INVOKED BY GC JUST BEFORE DESTROY OBJ TO PERFORM CLEANI=UP ACTIVITES ONES FINAIZE METHOD COMPLETE GC DESTROY THA OBJ
FINAL AND FINALIZE BOTH ARE RESPONSIBLE FOR CLEAN UP CODE
FINAL BLOCK ASSOCIATED WITH TRY BLOCK FOR CLEAN UP CODE
//FINALIZE() METHOD IS RELATED TO OBJ CLEAN UP ,
 * 
 */
	try {
		System.out.println(10/0);
		
	} 
	
	

	catch (Exception e) {
	e.printStackTrace();
	}
	
		/*
		 * catch(ARITHMETICEXCEPTION A) 
		 * {
		 *  A.PRINTSTACKTRACE();
		 *   }
		 */
		  		 
}
}