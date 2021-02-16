package in.nit.IQuestionsTesT;

import java.util.HashSet;


class Employee{
	String ename;
	int id;
	
	
	public Employee(String enmae,int id) {
		this.ename=ename;
		this.id=id;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	
}
public class TestHashset {

	public static void main(String[] args) {
	 
		Employee e1=new Employee("biss",1);
		Employee e2=new Employee("biss",1);
		
		HashSet s=new HashSet();
		
		s.add(new Employee("biss",1));
		s.add(new Employee("biss",1));
		System.out.println(s.size());
		
		
		if(e1.equals(e2)) {
			System.out.println("having same");
		}
		else {
			System.out.println("having different data");
		}
		

	}

}
