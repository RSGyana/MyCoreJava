package in.nit.java8;

import java.util.function.Predicate;

public class Predicate3 {

	//check whether the string is starts witk or not and print starts with k
	public static void main(String[] args) {
		String[] names= {"kajal","karina","katrina","samantha"};
		//String s1="kajal";
		Predicate<String> p=s->s.charAt(0)=='k';
		//System.out.println(p.test(s1)); //true


		for(String s1:names)
		{ if(p.test(s1)) { 
			System.out.println(s1); }
		}



	}

}
