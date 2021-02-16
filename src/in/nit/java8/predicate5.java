package in.nit.java8;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String pwd;
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + "]";
	}
	
}

public class predicate5 {

	public static void main(String[] args) {
		
		Predicate<User> p=c->c.username.equals("gyana") && c.pwd.equals("rs");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		
		String username=sc.next();
		System.out.println("enter pwd");
		String pwd=sc.next();
		User u=new User(username, pwd);
		if(p.test(u)) {
			System.out.println("sucessfully entered and welcome to prediacte world");
		}
		else {
			System.out.println("wrong authentication");
		}
		

	}

}
