package in.nit.java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eid;
	String ename;
	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
	}

	public String toString() {
		return eid+":"+ename;
	}
	
	
}
public class CustomSortedUsingLambda {
	
	public static void main(String[] args) {
		/*
		 * Employee e=new Employee(1,"jk"); System.out.println(e);
		 */
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(1,"ename"));
		l.add(new Employee(21,"dname"));
		l.add(new Employee(14,"gname"));
		l.add(new Employee(17,"pname"));
		
		
		System.out.println("before sorting---"+l);
		Collections.sort(l,(e1,e2)->(e1.eid>e2.eid)?-1:(e1.eid<e2.eid)?1:0);//lambda expression
	    System.out.println(" after sorting---"+l); 	
	}

}
