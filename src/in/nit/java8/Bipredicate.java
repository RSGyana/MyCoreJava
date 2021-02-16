package in.nit.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bipredicate {
//WAP TAKE TWO INPUT AND ADD ,CHECK THE SUM IS EVEN NUMEBER OR NOT
	public static void main(String[] args) {
		// it will take two input
		 
		
		BiPredicate<Integer,Integer> p=(a,b)->(a+b) %2==0;
		System.out.println(p.test(12, 23));//false
		System.out.println(p.test(12, 26));//true
		System.out.println(p.test(12, 28));//true
		
		
		
		
		
		
		
		
		
		
		

	}

}
