package in.nit.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	
	String name;
	int marks;
	public Student( String name, int marks) {
		super();
	
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [ name=" + name + ", marks=" + marks + "]";
	}

}
public class TestGrade {

	public static void main(String[] args) {

		ArrayList<Student> l=new ArrayList<Student>();
		populate(l);
		//System.out.println(l);
		Predicate<Student> p=s->s.marks>=65;
		Function<Student, String> f=m->{
			int marks=m.marks;
			if(marks>=65) {
				return "A";
			}
			else if(marks>50) {
				return "B";
			}
			else {
				return "useless fellos";
			}
		};
		
		Consumer<Student> c=n->{
			System.out.println("std name=="+n.name);
			System.out.println("std marks=="+n.marks);
			System.out.println("std grade=="+f.apply(n));
		};
		for(Student s:l) {
			if(p.test(s)) {
				c.accept(s);
			}
		}
	}





public static void populate(ArrayList<Student> l) {
	l.add(new Student("sakunj", 55));	
	l.add(new Student( "dakunj", 65));	
	l.add(new Student( "kakunj", 86));	
	l.add(new Student( "jakunj", 95));
}

}
