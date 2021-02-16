package in.nit.java.Collection;

import java.util.concurrent.CopyOnWriteArraySet;

public class concurrentColl6 {
	//it is a thread safe ver of set
	//all opertion allowed,but same as cowal remoce oprn not allwed

	public static void main(String[] args) {
		CopyOnWriteArraySet s=new CopyOnWriteArraySet();
		s.add("a");
		s.add("b");
		s.add(null);
		s.add(199);
		s.add('d');
		System.out.println(s);
		//[a, b, null, 199, d]
		

	}

}
