package in.nit.java8;

import java.util.Scanner;
import java.util.function.Function;

//write a prog for authentication
public class fun4 {

	public static void main(String[] args) {
	
		Function<String,String> f1=s->s.toLowerCase();
		Function<String,String> f2=s->s.substring(0,5);
		
		System.out.println(f1.andThen(f2).apply("gyanak"));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String  username=sc.next();
		System.out.println("enter pwd");
		String pwd=sc.next();
		if(f1.andThen(f2).apply(username).equals("gyana") && pwd.equals("1995")) {
			System.out.println("valid user");
		}
		else {
			System.out.println("invalid user");
		}

	}

}
