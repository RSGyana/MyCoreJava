package in.nit.java8;
 //wap who are having >18 and gf will allow to club
import java.util.function.Predicate;

class Softwareeng{
	String name;
	int age;
	boolean ishavinggf;
	public Softwareeng(String name, int age, boolean ishavinggf) {
		super();
		this.name = name;
		this.age = age;
		this.ishavinggf = ishavinggf;
	}
	@Override
	public String toString() {
		return "Softwareeng [name=" + name + ", age=" + age + ", ishavinggf=" + ishavinggf + "]";
	}
	
	
}

public class Predicate6 {

	public static void main(String[] args) {
		
Softwareeng[] se= {new Softwareeng("jk",24,true),
		            new Softwareeng("kb",24,true),
		               new Softwareeng("sam",24,true),
		                 new Softwareeng("lucky",24,false),
                      };
		
		Predicate<Softwareeng> allowed=s->s.age>18 && s.ishavinggf;

		System.out.println("software engneer are allowed");
		
		for(Softwareeng soft:se) {
			if(allowed.test(soft)) {
				System.out.println(soft);
			}
		}
		
	}

}
