package in.nit;

import java.util.Scanner;

public class Biss {
public static void m1() {
	System.out.println("enter the value of a and b");
	
	Scanner scn=new Scanner(System.in);
	int a1=scn.nextInt();
	int a2=scn.nextInt();
	
	System.out.println("swap the value of a and b");
	a1=a1+a2;
	a2=a1-a2;
	a1=a1-a2;
	System.out.println("After swaping the value a  and b is \n"+a1 +" \n"+a2);
}
	public static void main(String[] args) {
		
	m1();

	}

}
