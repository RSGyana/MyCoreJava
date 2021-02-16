package in.nit.java8;

import java.util.HashSet;

class Student12
{
	int rollNo;
	String name;
	
	Student12(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((name == null) ? 0 : name.hashCode()); result =
	 * prime * result + rollNo; return result; }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student12 other = (Student12) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student12 [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Student12> hs=new HashSet<Student12>();
		hs.add(new Student12(15,"biss"));
		hs.add(new Student12(15,"biss"));
		hs.add(new Student12(1,"bissg"));
		System.out.println(hs.size());
		System.out.println(hs);
				  
		
		
		
	}

}
