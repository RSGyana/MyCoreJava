package in.nit.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//to add some element and check and print even  no by using stream


public class Stream1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(3);
		l.add(4);
		l.add(16);
		l.add(22);
		l.add(31);
		System.out.println(l);
		
		List<Integer> l1=new ArrayList<Integer>();
	for(Integer i:l) {
			/*
			 * if(i%2==0) { l1.add(i); //by collection oprn }  //to get even number
			 */
		l1.add(i=i*i);  //to get square value
	}
	System.out.println(l1);
	
	//by stream oprn
		//List<Integer> list=l.stream().filter(i->i%2!=0).collect(Collectors.toList()); //to get ecen no
		//System.out.println(list);
	List<Integer> a=l.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(a);



	}
}









