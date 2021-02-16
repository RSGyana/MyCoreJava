package in.nit.java.Collection;


import java.util.Comparator;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IT IS CHILD OF MAP
		//IT IS A GROUP OF PAIR(KEY AND VALUE)ACOORDING TO SORTING ORDER 
		// BASED ON KEY(NOT IN THE VALUE)
  // SORTED MAP HAVE 6 METHODS
	//	EX= {101 A,102 B,103 C,104 D,105 E,106 F}
	//	1-FIRSTKEY //101 A
	//	2-LASTKEY //106 F    ARG
	//	3-HEADMAP(OBJ KEY)--(102)  //101 A
	//	4-TAILMAP(OBJ KEY)  (104)  //104 D,105 E,106 F
	//5-SUBMAP(OBJ KEY1,OBJ KEY2)--(102,104)//102 B,103 C
	//	6-COMPARATOR()
		//IF WE R DEPPENDING ON  CUSTOMIZED SORTING THEN KEY SHOULD  NOT HOMOGENIOUS AND COMPARABLE
		//IF WE R DEPPENDING ON DEFAULT NATURAL SORTING THEN KEY SHOULD HOMOGENIOUS AND COMPARABLE
		
		//====NULL  ACEPTANCE==
		//FOR NON EMPTY TRREMAP IF AE R TRYING TO ENTRY NULL THEN WE WILL GET NPE
		//EMPTY TREE MAP NULL ACCPET AFTER THAT NO ENTRY,IF WE R TRYING THEN NPE(UPTO 1.6V)
		//AFTER THAT NOT ALLOWED NULL AS FIRST ENTRY FOR KEY(BUT VALUE WE CAN TAKE NULL)
		
		//====CONSTRUCTOR===
		
		//SANME CONSTRUCTOR AVAILABLE IN SORTEDMAP
		
		//treemap t=new treemap();
		//treemap t=new treemap(compartor);
		//treemap t=new treemap(sortedmap map);
		//treemap t=new treemap(map m);
		
		//default sorting order using treemap  ex
		/*
		 * TreeMap t=new TreeMap(); t.put(100,"jk"); t.put(132,"kk"); t.put(145,"tk");
		 * t.put(193, "ghomm"); System.out.println(t);//{100=jk, 132=kk, 145=tk,
		 * 193=ghomm} System.out.println(t.put(104,626));//null
		 * System.out.println(t.put("ff", 75));//cce
		 */		
		//customized sorting ex
		TreeMap t=new TreeMap(new myComparator());
		t.put("a","jk");
		t.put("g","kk");
		t.put("b","tk");
		t.put("d", "ghomm");
		System.out.println(t);//{a=jk, b=tk, d=ghomm, g=kk} sorted
		System.out.println(t.put(104,626)); //null
		 System.out.println(t.put("ff", 75));//null
	}

}

class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return 
				-s1.compareTo(s2);
	}
	
}