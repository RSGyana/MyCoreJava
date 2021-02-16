package in.nit.java.exception;

import java.util.Scanner;

class tooYoung extends RuntimeException{
	public tooYoung(String s) {
		super(s);
	}
}

class tooOld extends RuntimeException{
	public tooOld(String s) {
		super(s);
	}
}
public class CustException {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int age=scn.nextInt();
		//int age=Integer.parseInt(args[0]);
		if(age>50) {
			throw new tooOld("plz wait for ...no chance");
		}
		else if(age<17) {
			throw new tooYoung("wait some yr we will get best match");
		}
		else {
			System.out.println("u r eligible,we will get the best very soon");
		}
	}

}
//for custom define xcpn by "throw" keyword(we are using)
//best choice throw keyword for custom degine exception
//highly recomended to extends from runtimeException that class
//bcz chkd exception can work for throw keyword otherwise error we will get


//all exceptiion are devided into two

//jvm excption
//when particular exception will occured//arithmatic ,npe

//programe excepn 

//if exception raised by prog.api devloper arre called prog exception
//like toolod exception,illegal exception