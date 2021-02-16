
package in.nit.java.Collection;
import java.util.*;

// treeset using comparator program how to sort an array (integer )

class Mycomparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer a=(Integer)o1;
		Integer b=(Integer)o2;
		/*if(a<b) {
			return +1;
		}
		else if(a>b) {
			return -1;
		}
		else 
		return 0;*/
		//return  0; // return only first element
		//return -1;// all element will print in insertion order
		//return +1 ; // all element will print in insertion order 
		//return a.compareTo(b); //asscendng order
		//return -a.compareTo(b); //descendng order
		//return b.compareTo(a); //descendng order
		return -b.compareTo(a); //asscendng order
		
		
	}
	
}

 class TreeSetIntegerTestProg{
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		TreeSet t=new TreeSet(new Mycomparator1());
		t.add(2);
		t.add(7);
		t.add(4);
		t.add(7);
		t.add(2); 
		System.out.println(t);
	}

}
