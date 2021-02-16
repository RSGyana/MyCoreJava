package in.nit.java.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
		//MAP INTERFACE METHOD
   //IT WONT APPLY COLLECTION METHOD IT APPLY ITS  OWN METHOD
		
		//1-METHOD OBJECT PUT(OBJECT KEY, OBJECT VALUE) TO ADD ANO PAIR OF KEY AND VALUE
	//IF THE KEY IS ALREADY PRESENT THEN  OLD VALUE REPLACE BY NEW VALUE RETURN OLD VALUE
		
		//2-METHOD  PUTALL(MAP M)
		//GET(OBJECT KEY)-RETURNS THE VALUE ASSOCIATED WITH SPECIFIED KEY
		//REMOVE(OBJECT KEY)-REMOVE KEYND VALUE
		//CONATINSKEY(OBJECT KEY)
		//CONATINSVALUE(OBJECT VALUE)
		//BOOLEAN ISEMPTY()
		//CLEAR()
		//SIZE()
	//	3-methods
		//set keyset()
		//collection values()
		//set entryset()
		//ENTRY INTERFACE(ECAH PAIR O KEY AN VALUE)
		
		//this methods are apply on entry specific methods
	//	getkey()
		//getvalue()
//		setvalue(object obj)
		
	//THE UNDERLYING DATASTRUCTURE IS 
	 //INSERTION ORDER IS NOR PRESERVED
	// HETERO ALLOWED BOTH KEY AND VALUE
	// NULL KEY-ALLOWED(1) VALUE(N TIMES)
	 //IMPL   RA,CLONEABLE,SERIALIAZBLE
		//HASHMAP IS THE BEST CHOICE IF OUR OPERATION IS FETCH
		//constructor
		// hashmap m=new hashmap();
		//hashmap m=new hashmap(int intialcapacity);
		//hashmap m=new hashmap(int intialcapacity,float fillratio);
		//fillratio means suppose fillratio is .75 after completing 75 another obj will be created
	//	hashmap m=new hashm(map m);
		
		
		HashMap m=new HashMap();
		m.put("jk", 10);
		m.put("kk", 30);
		m.put("sk", 40);
		m.put("dk", 50);
		System.out.println(m);  //{kk=30, jk=10, dk=50, sk=40}
		System.out.println(m.put("ck", 100)); //null
		System.out.println(m);  //{kk=30, jk=10, dk=50, sk=40, ck=100}
		System.out.println(m.put("kk", 86));  //30 old value
		Set s=m.keySet();
		System.out.println(s);  //[kk, jk, dk, sk, ck]
		
    Collection c=m.values();
    System.out.println(c); //[86, 10, 50, 40, 100]

    Set s1=m.entrySet();
    System.out.println(s1);//[kk=86, jk=10, dk=50, sk=40, ck=100]
    Iterator i=s1.iterator();
    while(i.hasNext()) {
    	Map.Entry m1=(Map.Entry)i.next();
    	System.out.println(m1.getKey()+"---"+m1.getValue());
    	if(m1.getKey().equals("jk"));
    	{
    		m1.setValue("65000");
    		
    	}
    	
    	
    }
		
		System.out.println(m);
		
		//kk---86
		//jk---10
		//dk---50
		//sk---40
		//ck---100
		//{kk=65000, jk=65000, dk=65000, sk=65000, ck=65000}
		
//		hashmap                                      hashtable
//		----------                                  ----------
//		every method is not synchronized                synchronized
//		
//		not thread safe (multiple allowed)         threadsafe(one at a time)
//		 realtively perfance is high              low
//		 null allowed to both                     not allowed (NPE)
//		1.2v non legacy                           legacy
		
		
		//by default hashmap non synch but we can get synch by using synchmap
		//map m1=collection.synchronizemap(;)
		
	
	}

}
