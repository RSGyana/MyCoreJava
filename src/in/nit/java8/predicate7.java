package in.nit.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class EEployee1 {
	int empid;
	String empname;
	String desg;
	double sal;

	public EEployee1(int empid, String empname, String desg, double sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desg = desg;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", desg=" + desg + ", sal=" + sal + "]";
	}

}

public class predicate7 {

	public static void main(String[] args) {
		ArrayList<EEployee1> list = new ArrayList<EEployee1>();

		
		  populate(list); System.out.println(list);
		 
//show mang record only
		Predicate<EEployee1> p= emp -> emp.desg.equals("mang");
		System.out.println("manger infor");
		display(p,list);
		
		//those who are getting sal exactly 389
		Predicate<EEployee1> p1=emp->emp.sal==389;
		System.out.println("sal 389 are");
		display(p1, list);
		
		//fetch empl1 record
		Predicate<EEployee1> p2=emp->emp.empname.equals("empname1");
		System.out.println("the empl1 all details");
  display(p2, list);
	}

	
	  
	  public static void populate(ArrayList<EEployee1> list1) {
		  list1.add(new  EEployee1(11, "empname1", "mang",389));
	     list1.add(new EEployee1(21, "empname2", "clk",3493.5));
	     list1.add(new EEployee1(31, "empname3","clk",389));
	     list1.add(new EEployee1(41, "empname4", "mang",3833.5)); 
	  }
	 
	public static void display(Predicate<EEployee1> p,ArrayList<EEployee1> list) {
		for (EEployee1 e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
	}

}
