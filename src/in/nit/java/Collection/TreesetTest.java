package in.nit.java.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
//TREESET,COMPARABLE,COMPARATOR DISCUSSION

		//all elements are inserted in natural order
		/* all constructor
		 * treese t=new treeset(); treeset t=new treeset(comparator c); treeset t=new
		 * treeset(collection c); treeset t=new treeset(sortedset s);
		 * 
		 */
		/*
		 * TreeSet t=new TreeSet(); t.add("A"); t.add("a"); //small "a -97" value is
		 * greater than "A-65" t.add("F"); t.add("J");
		 * 
		 * System.out.println(t); t.add("1"); System.out.println(t); //t.add(new
		 * Inetger(10)); cce t.add(null); //NPE
		 * 
		 */		// for empty treeset if we will add null accept,but after that if we add ,then we will get NPE 
		// for non-empty treeset if we arre trying add null yhen we will get NPE

		//untill 1.6 v null is allowed s fst element,after that not allowe
		
		/*
		 * TreeSet t=new TreeSet(); t.add(new StringBuffer("A"));
		 * System.out.println(t);//CCE
		 * 
		 */		/*
		 * if we are depending on default natural sorting order, otherwise we will get run
		 * time excpn CCE a obj is to be comparable (all string class and wrapper class
		 * are comparable, but string buffer in not comparable(thats why we will get
		 * CCE))
		 *   
		 *   //IN COMPARETO() METHOD  IF WE ARE COMPARING TWO OBJS THEN WE WILL GET ALL THESE THINGS 
		 *   IFF OBJ1 COME FST RETURN -VE
		 *   IFF OBJ2 COME FST RETURN +VE
		 *   IFF BOTH ARE EQUAL  RETURN 0
		 * 
		 */		 
		/*
		 * System.out.println("A".compareTo("Z"));//-25
		 * System.out.println("j".compareTo("h"));//2
		 * System.out.println("j".compareTo("j"));//0
		 * 
		 * treeset internallly uses compareto method
		 */
 
		/*
		 * TreeSet t=new TreeSet();
		 *  t.add("K"); 
		 *  t.add("Z");
		 *   t.add("A"); 
		 *   t.add("A");
		 * t.add("k"); 
		 * System.out.println(t);
		 */
    //if we r default natural  insertion order when we add  obj to the treset jvm internallly call comapreto()

//comparable meant for default natural sorting order(compareTo()) //java.lang
//comparator meant for customized  sorting order( 2 methods compare(),and equals() //java.util

		/*
		 * public int compare(object obj1,object obj2)
		 *  IFF OBJ1 COME FST RETURN -VE IFF
		 * OBJ2 COME FST RETURN +VE 
		 * IFF BOTH ARE EQUAL RETURN 0
		 * 
		 * public boolean equalls(object obj)
		 * 
		 * when we r implementing comaprator interface ,compulsory we should provide impl for comapreto(),
		 * but not for equalls() ,bcz it is in object class thorugh inheritance
		 */


	
   
		/*  this for integer type
		 * TreeSet t=new TreeSet(new myComparator()); t.add(10); t.add(0); t.add(15);
		 * t.add(20); t.add(25); System.out.println(t);
		 */

		TreeSet t=new TreeSet(new myComparator2());
		/*
		 * t.add("ram"); t.add("sam"); t.add("dham"); t.add("jam"); t.add("kam");
		 * t.add("aam"); System.out.println(t);
		 * 
		 */
		
		/*
		 * string buffer 
		 * t.add(new StringBuffer("A")); t.add(new StringBuffer("Z"));
		 * t.add(new StringBuffer("X")); t.add(new StringBuffer("H"));
		 * System.out.println(t);
		 */
		 t.add("ram");
		 t.add("sam");
		 t.add(new StringBuffer("A"));
		 t.add(new StringBuffer("D"));

  



	}

}
class myComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		/*
		 * Integer i1=(Integer)o1; Integer i2=(Integer)o2;
		 */
		String s1=o1.toString();
		String s2=o2.toString();// we can write two way tostring ang casting
		//but incase stringbuffer only caste to tostring otherwise CCE
		//return s1.compareTo(s2);  //[aam, dham, jam, kam, ram, sam]
		//return -s1.compareTo(s2);    //[sam, ram, kam, jam, dham, aam]
		//return -s1.compareTo(s2);//[Z, X, H, A] 
		return s1.compareTo(s2);      //[A, H, X, Z]
		/*             
		 * if(i1<i2) { return +1; }
		 * 
		 * else if(i1>i2) { return -1; } return 0;
		 */
		//return i1.compareTo(i2);  //[0, 10, 15, 20, 25]
		//return -i1.compareTo(i2);   //[25, 20, 15, 10, 0]
		//return i2.compareTo(i1);   //[25, 20, 15, 10, 0]
		//return -i2.compareTo(i1);   //[0, 10, 15, 20, 25]
		//return +1 ;               //[10, 0, 15, 20, 25]
				//return -1;             //[25, 20, 15, 0, 10]
		
		//return 0;         //[10]

		
	}
}

//DIFF B/W COMPARABLE AND COMPARATOR
 //FOR OUR OWN CLASS EMPLOYEE IS RESPONSIBLE FOR IMPLEMENTING DEFAULT NATURAL SORTING ORDER
 //BUT THOSE WHO ARE NOT SATIESFY WITH DEFAULT(COMPARABLE) THEN GO CUSTOMIZED(COMPARATOR)


     //  COMPARABLE                                  COMPARATOR
       //----------                                  ----------
     // 1- DEFAULT NATURAL SORT ORDER               CUSTOMIZED
     // 2-JAVA.LANG                                 JAVA.UTIL
     // 3-ONLY ONE METHOD(COMPARETO)                2 METHOD COMPARE.EQUAL
     // 4-STRING,WRAPPER CLS IMPL COMPARABLE        ONLY COLLATOR,RULEBASEDCOLLATOR
      
      //comparision table of set impl classes
        //property       hashset             linkedhashset          treeset
        //---------      -------            --------------         ------------
        //dup obj          no                --                       ---
        //insertion
       // order            no               preserved                    no
     //   sorting 
      //  order            no                no                           apllicable
       //  hetero 
        // obj             yes               yes                            no
        // null            yes                yes                       yes ,but till 1.6v(fst element)
      












