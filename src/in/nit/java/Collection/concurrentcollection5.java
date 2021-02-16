package in.nit.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentcollection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CopyOnWriteArrayList l=new CopyOnWriteArrayList();
//ArrayList l=new ArrayList(); //ConcurrentModificationException
//traditional arrylist cant update
l.add("a");
l.add("b");
l.add("c");
l.add("d");
Iterator itr=l.iterator();
l.add("e");
while(itr.hasNext()) {
	String s=(String)itr.next();
System.out.println(s);
}
}
}
