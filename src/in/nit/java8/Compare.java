package in.nit.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;
/*class Mycomp implements Comparator<Integer>{
public int compare(Integer i1,Integer i2) {
	return (i1<i2)?-1:(i1>i2)?+1:0;
}


}
 */


public class Compare {
	public static void main(String[] args) {

		/* Arraylist operation using lambda expression
		 * //Araaylist is follows insertuon order and store duplicate ArrayList<Integer>
		 * l=new ArrayList<Integer>(); l.add(0); l.add(4); l.add(19); l.add(14);
		 * l.add(6); l.add(29); //shorting element by using comparator and lambda
		 * expression System.out.println("before sort"+l);
		 * Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		 * System.out.println("after sort"+l);
		 * 
		 * //short method to short the element System.out.println("before sort"+l);
		 * Collections.sort(l); System.out.println("after sort"+l);
		 */

		/*
		 * // Set Colllection operation //here we have passed comparator as argument in
		 * treeset constructor TreeSet<Integer> t=new
		 * TreeSet<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0); t.add(0); t.add(14); t.add(24);
		 * t.add(44); t.add(34); System.out.println(t);
		 */
		//treemap not allow duplicate key but value allow  by default ascending order
		TreeMap<Integer,String> m=new TreeMap<Integer,String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		m.put(1,"jk");
		m.put(2,"kk");
		m.put(4,"pk");
		m.put(9,"rk");
		m.put(7,"lk");
		m.put(3,"sk");
		m.put(2,"jk");
		System.out.println(m);  // o/p {9=rk, 7=lk, 4=pk, 3=sk, 2=jk, 1=jk}
	}
}
