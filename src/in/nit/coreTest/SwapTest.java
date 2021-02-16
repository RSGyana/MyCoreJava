package in.nit.coreTest;

import java.util.Scanner;



public class SwapTest {

	public static void main(String[] args) {
		//Swaping number
		int a=100,
		b=20;
		//without third variable
		a=a+b; //a=30
		b=a-b;  //b=10
		a=a-b; //20
		
		System.out.println(a+"--"+b);

		//with third var
		int X=30,Y=50,var;
		var=X;
		X=Y;
		Y=var;
		System.out.println(X+"--"+Y);
		
		System.out.println("print diff line hii hello and welcome");
		System.out.println("Hii \n hello \n welcome");

		
		
			
	}

}
