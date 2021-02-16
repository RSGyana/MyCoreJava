package in.nit.java8;

import java.util.function.Predicate;

public class predicate8 {

	public static void main(String[] args) {
		//abstract method==test()
		//default  and ,or,negate
		//static method  isequal
		
		Predicate<String> p=Predicate.isEqual("jk");
	System.out.println(	p.test("jk"));//true
	System.out.println(	p.test("kk"));//false

	}

}
