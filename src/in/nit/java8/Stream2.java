package in.nit.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
	//STREAM(parent is collection)
//to proces thr cols obj we used stream concept
	//to filter in an opreration we used filter()  <to check>  ==bollean
	//ex==(i->i%2==0)
	//to create new equivalent  obj then we go for map()  (to square the existing obj)
	//ex==(i->i*i)
	
	//METHODS
	//collect()==to collect the elemment we use
	//count()==to count the no of element
	//sort()==bto sort the element we use sort,there are two types  
	//sorted()**default,   sorted(comparetor)==custom
	//min()==to get min value
	//max()==to get max value
	//forEach()==to print the element
	//toarray==present in element in stream specifiy to arrray
	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("jkumar");
		l.add("djbravos");
		l.add("dkus");
		l.add("skkumar");
		System.out.println(l);
		
		//filter
		List<String> l1=l.stream().filter(s->s.length()>=5).collect(Collectors.toList());
		System.out.println("those name aree hab=ving >=5 letter name will print==="+l1);
		
		//counnt
		Long  l2=l.stream().filter(s->s.length()>=5).count();
		System.out.println("count those name who are having >5 letter=="+l2);
		
		//map
		//make upper case we use {map} (bcz we are modifying that means we will create new obj)
		List<String> l3=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("make upercase"+l3);
		
		//sort
		List<String> l4=l.stream().sorted().collect(Collectors.toList());
		//deafult sorting order
		System.out.println("sorted elements are=="+l4);
		
		//i want custom sorting order
		
		//-i1.compareTo(i2)==decreasing order
		//i1.compareTo(i2)==increasing order
		
		List<String> l5=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("custom sorted elements are=="+l5);
		
		String min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("the min value  "+min);
		String max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("the max value "+max);
		//forEach()== to print the element
		l.stream().forEach(System.out::println);
		String[] arr=l.stream().toArray(String[]::new);
		for(String s:arr) {
			System.out.println("to array element=="+s);
		}

	}

}
