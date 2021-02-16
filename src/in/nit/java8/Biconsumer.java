package in.nit.java8;

import java.util.function.BiConsumer;

public class Biconsumer {
//it will accept two argu but wont return anything
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //wap concat two string by using biconsumer
	
	BiConsumer<String,String> b=(s1,s2)-> System.out.println(s1+s2);
	b.accept("Natraz", "sir");
	b.accept("HK", "sir");
	b.accept("raghu", "sir");
	b.accept("shudhakar", "sir");
	}

}
