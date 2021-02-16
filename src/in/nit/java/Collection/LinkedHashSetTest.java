package in.nit.java.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		//treeset and treemap heterogenious is not allowed
		
		
		//linked hash set is similar to hashset but difference is in this 
		//insertion order is  preserved and duplicate is not allowed
       //it child class of hashset(1.2v),linkedHashset(1.4v)
		
		
		
		  HashSet h1=new HashSet();
		  h1.add("1"); 
		  h1.add("f"); h1.add("v");
		  h1.add("b");
		  h1.add("b"); 
		  System.out.println(h1); //[1, b, f, v] not preserved insertion order
		 
		  
     LinkedHashSet h=new LinkedHashSet();
     h.add("3");
     h.add("t");
     h.add("ff");
     h.add("g");
     h.add("b");
     h.add("b"); //duplicate not allowed
		 //[3, t, ff, g, b]  insertion order is preserved
		  System.out.println(h);
		
		  
		  //soreted set is child of set interface
		  //if we want represnt group of object in sorted 
		  //predefined methods
		/*
		 * data -100,101,104,106,110115,120
		 * 
		 *  first -100 last-120 headset(106) 100,101,104
		 * tailset-(106),110,115,120 subset(101,115)-101,104
		 * ,106,110, 
		 * comarator()
		 */		}

}
