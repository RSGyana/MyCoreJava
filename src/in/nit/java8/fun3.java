package in.nit.java8;

import java.util.function.Function;

public class fun3 {
	//fun chaining
//  at a time we can call two methods
	//there are two methods (default methods) and one is static method ==identity
	//f1.andthen.f2 ==means f1 apply fst then f2
	//f1.compose.f2==f2 fst then f1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> f1=s->s.toUpperCase();
		Function<String, String> f2=s->s.substring(0,5);
		
		
		
		System.out.println(f1.apply("gyana kumar"));
		System.out.println(f2.apply("gyana kumar"));
		System.out.println(f1.andThen(f2).apply("sambilings"));  //SAMBI
		//first upcase=SAMBILINGS then 5 char SAMBI
		System.out.println(f1.compose(f2).apply("dakunj"));//DAKUN
		//FIRST 5 CHAR dakun then upcase DAKUN
		
		/*o/p
		 * GYANA KUMAR 
		 * gyana
		 *  SAMBI
		 *   DAKUN
		 */
		
		Function<Integer, Integer> f3=s->s+s;
		Function<Integer, Integer> f4=s->s*s*s;
		
		System.out.println(f3.andThen(f4).apply(3));  //216
		System.out.println(f3.compose(f4).apply(6)); //432
		
		//identityt methods it will return same things
		Function<String, String> f5=Function.identity();
		System.out.println(f5.apply("gyana")); //gyana
		
		
	}

}
