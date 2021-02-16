package in.nit.java8;

import java.util.function.Supplier;

//wap generate 8 char pwd randomly
//even position idgit and odd postion A-Zand @#$
public class supplierranodm8digitoPwd3 {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			String pwd="";
			//it will generate digit
			Supplier<Integer> d=()->(int)(Math.random()*10);
			
			String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%&";
			Supplier<Character> c=()->
				s1.charAt((int)(Math.random()*30));
						
			
		
		
		for(int i=0;i<8;i++){
			if(i%2==0) {  //it will add digit in even position
				pwd=pwd+d.get();
			}
			else {
				pwd=pwd+c.get(); //add char in odd pos
			}
		}
		return pwd;
		};

	System.out.println(	s.get());
	System.out.println(	s.get());
	System.out.println(	s.get());
	System.out.println(	s.get());
	}

}
