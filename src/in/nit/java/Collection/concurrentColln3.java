package in.nit.java.Collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentColln3 {

	public static void main(String[] args) {
		//CopyOnWriteArrayList<E> it is thread safe
		//adv if more no of read oprn
		//disadv==if more no of write oprn
		//created clone copy for every separate oprn,performaance is low
		
		//copyonwritearraylist cant perform remove
		//incase arraylist if we modify we get exception//concurentmodifcnexcpn
		//but we cant get xcpn incase of copyonwritearraylist,here pointing one obj
		//bcz it maintain separate clone copy obj
		//constructor*
 //CopyOnWriteArrayList list=new CopyOnWriteArrayList();
// CopyOnWriteArrayList list=new CopyOnWriteArrayList(Collection c);
// CopyOnWriteArrayList list=new CopyOnWriteArrayList(Object[] a);
		
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l); //[A, B]
		CopyOnWriteArrayList l1=new CopyOnWriteArrayList();
		l1.add("C");
		l1.add("D");
		l1.addAll(l);
		System.out.println(l1); //[C, D, A, B]
		CopyOnWriteArrayList l2=new CopyOnWriteArrayList();
		l2.add("E");
		l2.addAllAbsent(l1);

		System.out.println(l2);// [E, C, D, A, B]

		l2.addIfAbsent("F");
		System.out.println(l2);//[E, C, D, A, B, F]
		
		l2.addIfAbsent("D");	
		System.out.println(l2);//[E, C, D, A, B, F]

		l2.addIfAbsent(l1);
		
		
		System.out.println(l2);//[E, C, D, A, B, F, [C, D, A, B]]
		l2.addAll(l1);
		System.out.println(l2);//[E, C, D, A, B, F, [C, D, A, B], C, D, A, B]
	}

}
