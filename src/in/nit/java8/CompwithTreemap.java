package in.nit.java8;

import java.util.TreeMap;

public class CompwithTreemap {
//sorting custom order by using lambda exp
	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<Integer,String>((i1,i2)->(i1>i2)?-1:(i2>i1)?+1:0);
		t.put(1, "nuny");
		t.put(2, "tuny");
		t.put(3, "suny");
		t.put(4, "duny");
		t.put(4, "duny");
		//System.out.println(t);  //{1=nuny, 2=tuny, 3=suny, 4=duny}
		System.out.println(t); //custom sort  {4=duny, 3=suny, 2=tuny, 1=nuny}
	  
	}

}
