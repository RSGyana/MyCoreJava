package in.nit.java8;

import java.util.function.Predicate;

//methods (negate,and ,or)
//prediacte joining
//we can aply two pedicate logic at a time
public class Predicacte2 {

	
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
			System.out.println(x1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] x={9,11,8,13,35,56,56,54,65,34,94};
		
		Predicate<Integer> p1=i->i%2==0; //even number
		Predicate<Integer> p2=i->i>20; //greater than 
		
		System.out.println("print even number");
		m1(p1,x);  //56,54,34,94
		
		System.out.println(">20 numbers are");
		m1(p2,x); //35,56,54,65,34,94
		
		System.out.println("not >20 numbers");
		m1(p2.negate(), x); //9,11,13
		
		System.out.println("print even no or  gretaer than 20");
		m1(p1.or(p2), x);
		/*35
		56
		54
		65
		34
		94
*/

		
System.out.println("print even and  >20  ");
		m1(p1.and(p2), x);
		
		/*
		 * 56 54 34 94
		 */
		

	}

}
