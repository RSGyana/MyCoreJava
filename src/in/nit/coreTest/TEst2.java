package in.nit.coreTest;

import java.util.Scanner;

public class TEst2 {
	//take no check if o print hello,if even 
	//print
	//between 0-10==hii
	//>10 ;;bye

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("take a integer check the range");
		int x=sc.nextInt();

		if(x%2!=0) {
			System.out.println("odd no HELLO ");
		}
		else {
			if(x%2==0) {
				if(x>=0 && x<=10) {
					System.out.println(" in range 0-10=== the value \t"+x);

				}

				else if(x>11) {
					System.out.println("bye"+x);
				}
			}
		}
	}
}