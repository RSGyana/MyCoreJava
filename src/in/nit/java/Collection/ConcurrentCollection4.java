package in.nit.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentCollection4 extends Thread{
static CopyOnWriteArrayList l=new CopyOnWriteArrayList(); //right choice
	//ArrayList l=new ArrayList();//Unresolved compilation problems
//arraylist support remove oprn,but copyonwritearrylist not support

public void run() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("chhild thread is updating===");
	l.add("C");
}

	public static void main(String[] args) throws InterruptedException {
		ConcurrentCollection4 t=new ConcurrentCollection4();
		l.add("A");
		l.add("B");
	t.start();
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		String s=(String)itr.next();
		System.out.println("main thread iterarting list and curent thread obj==="+s);
		Thread.sleep(3000);
	}
System.out.println(l);
	}

}
