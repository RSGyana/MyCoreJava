package in.nit.java.Collection;

import java.util.Hashtable;



public class HashTablTest {
///default capacity hash table 11 (buckets)
	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) {
	Hashtable t=new Hashtable(22);
	System.out.println(t.put(new Temp1(2),"A"));
	t.put(new Temp1(3),"K");
	t.put(new Temp1(4),"H");
	t.put(new Temp1(18),"F");
	t.put(new Temp1(52),"C");
	
	System.out.println(t);

	}

}


class Temp1{
	int i;
	Temp1(int i){
		this.i=i;
		
	}
	public int hashCode() {
		return i;
	}
	public String toStgring() {
		return i+"";
	}
}







