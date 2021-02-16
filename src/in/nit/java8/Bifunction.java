package in.nit.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;


class Student5{
	int rollno;
	String name;
	public Student5(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
public class Bifunction {

	public static void main(String[] args) {
		//bifunction
				//it wil take three input two arg and one return type
				
				BiFunction<Integer, Integer,Integer> f=(a,b)->a*b;
				System.out.println(f.apply(12, 2));//24
				System.out.println(f.apply(12, 21));//252
				System.out.println(f.apply(12, 27));//324
				
				ArrayList<Student5> l=new ArrayList<Student5>();
				
				BiFunction<String,Integer,Student5> f1=(rollno,name)->new Student5(name,rollno);
				
				l.add(f1.apply("jk", 47));
				l.add(f1.apply("kk", 57));
				l.add(f1.apply("lk", 37));
				l.add(f1.apply("pk", 27));
				for(Student5 s:l) {
					
					System.out.println("namr is =="+s.name);
					System.out.println("the roll no is=="+s.rollno);
				        
				 }
				
       
	}

}
