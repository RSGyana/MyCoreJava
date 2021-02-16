package in.nit.java8;

import java.util.function.Function;

public class fun1 {

	public static void main(String[] args) {
		// TO perform some oprn and return some value 
		//we will use function  function(T,R)
		//it contain one method(abstract) ==apply
		
		
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("gyana"));  //5
		System.out.println(f.apply("rsgyana"));  ///7
		
		Function<Integer,Integer> f1=s1->s1*s1;
		
		System.out.println(f1.apply(7));//49
		System.out.println(f1.apply(33));//1089
		
		//delete space
		String s="welcome to function";
		Function<String,String> f2=s2->s2.replace(" ","");
		System.out.println(f2.apply(s));  //welcometofunction

		//wap to find the spaces 
		
		Function<String,Integer> f3=s3->s3.length() - s3.replace(" ","").length();    
		System.out.println(f3.apply(s)); //2
		
	}

}
