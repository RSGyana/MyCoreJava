package in.nit.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Employee122{
	Integer empId;
	
	String empName;
	public Employee122(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	
}

public class LambdaEx1WithMap {
	
	public static void main(String[] args) {
		ArrayList<Employee122> m=new ArrayList<Employee122>();
		m.add(new Employee122(102,"kl"));
		m.add(new Employee122(104,"pl"));
		m.add(new Employee122(106,"gl"));
		m.add(new Employee122(107,"fl"));
		m.add(new Employee122(109,"wl"));
		System.out.println("before sortimg order"+m);
		Collections.sort(m,(i1,i2)->(i1.empId<i2.empId)?1:(i1.empId>i2.empId)?-1:0);
		System.out.println("after sorting order :"+m);
		
	}

	
 
}
