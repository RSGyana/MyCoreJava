package in.nit.java8;

import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

//like intpredicate rest are threr 

public class PrimitiveInterface {

	public static void main(String[] args) {
		//performance wise better than normal interface
		//autoboxing,autounboxing,generics
		  // print even number
		
		int[] a= {4,3, 8,6,8};
		
		IntPredicate p=s->s%2==0;
		
		//ToIntFunction rest are there
	for (int x:a) {
	    if(p.test(x)){
	    	System.out.println(x);
	    }
	}

	}

}




