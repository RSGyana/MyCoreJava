package in.nit.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class predicate4 {
//the record should not be  contain null and emtpy
	public static void main(String[] args) {
		
		String[] names= {"kajal",null,"","karina",null,"katrina","samantha"};
		
		
		Predicate<String> p=s->s.length() !=0 && s != null;
		
		ArrayList<String> l=new ArrayList<String>();
		
		for(String s1 : names) {
			if(p.test(s1)){
				l.add(s1);
			}
			
		}
		System.out.println(l);
		
	}

}
