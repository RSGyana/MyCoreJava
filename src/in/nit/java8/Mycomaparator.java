package in.nit.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class mycomapartor implements Comparator{
//we can sort array bt predefine method or customr define method


	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		 * if(i1>i2) { return -1; } else if(i1<i2) { return +1; } return 0;
		 
		return (i1>i2)?-1:(i2>i1)?+1:0;
	}
	
}*/
public class Mycomaparator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(44);
		l.add(23);
		l.add(21);
		l.add(57);
		l.add(54);
		System.out.println("before sorting" + l);
		Collections.sort(l);
		System.out.println("by predefine method sort"+l);
		Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i2>i1)?+1:0);
		/*
		 * System.out.println("by pre define method sort" + l); Collections.sort(l, new
		 * mycomapartor());
		 */
		System.out.println("after sorting  custom order " + l);
	}

}
