package in.nit.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



//we can apply stream concept over colls and group of value and array also 
public class Stream3 {

	public static void main(String[] args) {
		
		/*
		 * //for group of values Stream<Number> s=Stream.of(8785,58.4,575,75378);
		 * s.forEach(System.out::println);
		 * 
		 * //stream concept apply for array Double[] d= {873.7,647.3,888.3};
		 * Stream<Double> d1=Stream.of(d); d1.forEach(System.out::println);
		 * 
		 * 
		 * List<Integer> a=Arrays.asList(33,44,45,57,555); a.stream();
		 * System.out.println(a); a.parallelStream(); System.out.println(a);
		 */
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	      list.stream().forEach(System.out::println);//it will print sequentialy one by one
	      System.out.println();
	      list.parallelStream().forEach(System.out::println); //randomly print at a time more than one
	   
}

}
