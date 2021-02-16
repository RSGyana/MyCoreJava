package in.nit.java.Collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcorrenntCollection {

	public static void main(String[] args) {
		//traditionaal collection are not thread safe,multiple thread can acces at a time(like list,set)
		//performance wise not mark to word bcz one obj will lock all the obj
		//to remaining thread we cant modify
		//if we will modify then we will get concuurentmodificationexception
		
		//All problem will solve by concuurent collection
		
		//importtant concuurenrt classes
		//ConcurrentHashMap,
		//CopyOnWriteArrayList<E>,
		//CopyOnWriteArraySet<E>
		
		ConcurrentHashMap c=new ConcurrentHashMap();
		c.put(154, "hgv");
		c.put(184,"bngv");
		c.putIfAbsent(1343,"hgu");
		c.putIfAbsent(184, "bbb");
		c.remove("154","gf"); //here key and value not match(not deleted)
		c.remove(184,"bngv");//here deleted bcz match
		c.replace(154,"hgv","yt");//if perfectly key and value match then replace otherwise
		System.out.println(c);// { 154=yt, 1343=hgu}

	}

}
//constrructor
//we can read n times at a time,but we can update at a time is 16,bcz capacity=16
/*default capacity 16(concurency level/bucket/part),loadfactor=filratio=.75(after fill 75% of curnt obj,another obj will create)
ConcurrentHashMap c=new ConcurrentHashMap();
ConcurrentHashMap c=new ConcurrentHashMap(intialcapacity);
ConcurrentHashMap c=new ConcurrentHashMap(intialcapacity,fillratio);
ConcurrentHashMap c=new ConcurrentHashMap(intialcapacity,fillratio,int concurrency level);
ConcurrentHashMap c=new ConcurrentHashMap(map p);*/