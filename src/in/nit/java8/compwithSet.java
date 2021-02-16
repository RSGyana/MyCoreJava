package in.nit.java8;

import java.util.Collections;
import java.util.TreeSet;

public class compwithSet {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i2>i1)?+1:0);
		t.add(2);
		t.add(43);
		t.add(2);
		t.add(45);
		t.add(87);
		t.add(66);
		System.out.println(t); //own sorting order [87, 66, 45, 43, 2] by lambda expsn
		//Collections.sort(t); this  is not appliacablle for treeset
		

	}

}
