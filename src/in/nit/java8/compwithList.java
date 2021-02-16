package in.nit.java8;

import java.util.ArrayList;
import java.util.Collections;


class Employeet{
	int empId;
	String empName;
	Employeet(int empid,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {
		return "Employeet [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}

public class compwithList {

	public static void main(String[] args) {
		
		ArrayList<Employeet> l=new ArrayList<Employeet>();
		l.add(new Employeet(121,"this"));
		l.add(new Employeet(134,"kis"));
		l.add(new Employeet(125,"pis"));
		l.add(new Employeet(151,"iis"));
		System.out.println("before sorting"+l);
		Collections.sort(l,(e1,e2)->(e1.empId>e2.empId)?-1:(e1.empId<e2.empId)?+1:0);
		System.out.println("after sorting"+l);
		
		

	}

}
