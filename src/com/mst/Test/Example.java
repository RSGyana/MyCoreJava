package com.mst.Test;
public class Test1{
	 private int a=10;
	 int b;
	  public int  setVar1(int b)
	  {
		  return this.b=b;
	  }	 
	  
	 public int  getVar() {
		 return a;
	 }
 }
 class Example extends Test1 {
public static void main(String[] args) {
	

	//	System.out.println(a);;
		//System.out.println(Example.a);
		Example e=new Example();
		System.out.println(e.b);
		System.out.println(e.getVar());
		
		
	

	}

}
