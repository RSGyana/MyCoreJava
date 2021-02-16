package in.nit.java8;

import java.util.Scanner;

public class Test {
	 static int b=90;
	 
	int i=10;
	public void m1() {
		System.out.println("welcome to method");
	}
		public static void main(String[] args) {
			int a=20;
		
		Test t=new Test();
		System.out.println(a);System.
		out.println(t.i);
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test.b);
		Test t2=t;
		System.out.println();
		t2.m1();
		
		
		/*
		 * String[][] s= {{"a","b"},{"c","d"}}; for(int i=s.length-1;i>=0;i--) { for(int
		 * j=0;j<s[i].length;j++) { // System.out.println(s[i][j]);
		 * 
		 * } System.out.println(s[i]);
		 * 
		 * }
		 */		/*
		 * int[][] x= {{10,20},{40,50},{70}}; for(var x1:x) { for(var x2:x1) {
		 * System.out.println(x2); } }
		 * 
		 * 
		 */
		}
}
		

