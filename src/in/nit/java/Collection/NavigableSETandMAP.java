package in.nit.java.Collection;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;


public class NavigableSETandMAP {

	public static void main(String[] args) {
		
		//navigable sorte map is pointing exact value or near thats pointing  to
		//specific value
/*
  TreeSet<Integer> t=new TreeSet<Integer>();
  t.add(11);
  t.add(115);
  t.add(131);
  t.add(13);
  System.out.println(t);//[11, 13, 115, 131]
  System.out.println(t.first());//11
  System.out.println(t.last());//131
  System.out.println(t.headSet(131));//11,13,115
  System.out.println(t.tailSet(13));//13,115,131
  System.out.println(t.ceiling(12));//>=12 //13
  System.out.println(t.floor(12));//<=12//11
  System.out.println(t.higher(13));//115
  System.out.println(t.lower(13));//11
  System.out.println(t.remove(13));//13 deleted
  System.out.println(t.descendingSet());//[131, 115, 11]  //descending order va;ue will pr
  int
  */
  
  //now we will discuss aboout naviagablemap
		//hoe to s	earc exact value or near value
		TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
		t.put(11,101);
		t.put(21,104);
		t.put(31,103);
		t.put(41,106);
		System.out.println(t);  //{11=101, 21=104, 31=103, 41=106}
		System.out.println(t.firstEntry());//11=101
		System.out.println(t.firstKey());//11
		System.out.println(t.pollFirstEntry());//11
		System.out.println(t.floorKey(44));//
		System.out.println(t.descendingMap());//
		System.out.println(t.ceilingKey(32));//
		System.out.println(t.ceilingEntry(12));//
		System.out.println(t.headMap(12));//
		System.out.println(t.pollLastEntry());//
		
  
	}

}


