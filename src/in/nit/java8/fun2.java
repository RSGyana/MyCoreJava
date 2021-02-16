package in.nit.java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


public class fun2 {

	//wap to increment salary whose sal>3500
	
	public static void main(String[] args) {
	
		ArrayList<Emplyoe> l=new ArrayList<Emplyoe>();
		populate(l);
		System.out.println(l);
		for(Emplyoe e:l) {
			System.out.println("before icrement sal");
			System.out.println("name=="+e.name+" " +"sal=="+e.sal);
		}
		//filter whore >3500
		Predicate<Emplyoe> p=e->e.sal>=3500;
		//here incr the salay
		Function<Emplyoe, Emplyoe> f=emp->{
			emp.sal=emp.sal+500;
			return emp;
		};
		ArrayList<Emplyoe> l2=new ArrayList<Emplyoe>();
		
		System.out.println("after icrement sal");
		for(Emplyoe e1:l) {
			if(p.test(e1)) {
				f.apply(e1);
				l2.add(e1);
			}
		
			System.out.println("name=="+e1.name+" " +"sal=="+e1.sal);
		}
		System.out.println("these are getting increment sal  ");
		System.out.println(l2);
		
		/*
		 * name==pjk sal==7442.3 after icrement sal name==jk sal==442.5 name==klk
		 * sal==2522.4 name==sjk sal==4932.4 name==pjk sal==7942.3 these are getting
		 * increment sal [Emplyoe [name=sjk, sal=4932.4], Emplyoe [name=pjk,
		 * sal=7942.3]]
		 */
	

	}
 public static void populate(ArrayList<Emplyoe> l) {
	 l.add(new Emplyoe("jk", 442.5));
	 l.add(new Emplyoe("klk", 2522.4));
	 l.add(new Emplyoe("sjk", 4432.4));
	 l.add(new Emplyoe("pjk", 7442.3));
 }
}

class Emplyoe{
	String name;
	double sal;
	public Emplyoe(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emplyoe [name=" + name + ", sal=" + sal + "]";
	}
	
}