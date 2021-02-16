package in.nit.java8;


import java.util.Date;
import java.util.function.Supplier;

//it wont take anything but suplly some thing data
//it contain one abstract method ==get()
public class Suplier1 {

	public static void main(String[] args) {
		
	
	Supplier<Date> s=()->new Date();
	System.out.println(s.get()); //Sat Jun 06 03:16:33 IST 2020
	
	Supplier<String> s1=()->{
		String[] s2= {"hk","raghu","natraz","shudhkar"};
		int x=(int) (Math.random()*4);
		return s2[x];
	};
	System.out.println(s1.get());
	//System.out.println(s1.get());
	//System.out.println(s1.get());
	
}
	}
