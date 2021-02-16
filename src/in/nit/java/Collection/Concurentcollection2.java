package in.nit.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class Concurentcollection2 extends Thread{
	
	static ConcurrentHashMap m=new ConcurrentHashMap();// adv collection 
	//static HashMap m=new HashMap();//ConcurrentModificationException
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("child thread updating");
		m.put(101,"rsb");
		
	}




	public static void main(String[] args) throws InterruptedException {
		// in concurrenthsahmap we can save and update simulstaniously without any exception
		//but we will get excpn in hashmap
		//but the modification may available to iterator/may not be
		//but traditional coll we cant modify like hash map
		
		m.put(105,"rsbr");
		m.put(103,"rs");
		Concurentcollection2 t=new Concurentcollection2();
		t.start();
		
	    Set s=m.keySet();
		Iterator ite=s.iterator();
		while(ite.hasNext()) {
			Integer i1=(Integer)ite.next();
			System.out.println("main thread iterarting and thread"+i1+"===="+m.get(i1));
			Thread.sleep(3000);
		}
System.out.println(m);
	}

}
