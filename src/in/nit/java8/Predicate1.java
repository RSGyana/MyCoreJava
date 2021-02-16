package in.nit.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Predicate1 {
//predicate is used validate is true or false
	//in that case we will choose predicate 
	//return type is boolean and conatain one method is  test()
	public static void main(String[] args) {
		
Predicate<Integer> p=i->i>10;
p.test(100);
System.out.println(p.test(100)); //true
System.out.println(p.test(5));  //false

Predicate<String> p1=s->s.length()>5;
System.out.println(p1.test("fhbfgbbbc")); //true 
System.out.println(p1.test("fhb")); //false

Predicate<Collection> p2=c->c.isEmpty();
ArrayList l=new ArrayList();
l.add("as");
System.out.println(p2.test(l)); //false

ArrayList l1=new ArrayList();

System.out.println(p2.test(l1)); //true
}

}
