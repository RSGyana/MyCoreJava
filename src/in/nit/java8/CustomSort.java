package in.nit.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class CustomSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(215);
		l.add(25);
		l.add(16);
		l.add(29);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,(o1,o2)->-((o1<o2)?1:(o1>o2)?-1:0));
		System.out.println(l);
		
		ArrayList<Integer> l1=(ArrayList<Integer>) l.stream()
				.sorted((o1,o2)->((o1>o2)?1:(o1>o2)?-1:0)).collect(Collectors.toList());
				
		System.out.println("the o"+l1);

	}

}
