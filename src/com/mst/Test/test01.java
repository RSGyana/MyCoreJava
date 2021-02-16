package com.mst.Test;

public class test01 {
	// fibbonacci number
	  public static void Fibbonacci(int n) {
		  System.out.println(n+""+"	is");
		  int s0=0,s1=1; 
		  System.out.println(s0+"\n"+s1);
		  for(int i=1;i<=n;++i) {
	  int sum=s0+s1;
	  System.out.println(sum);
	  s0=s1; 
	  s1=sum;
	  
	  
	  } 
		  
		  }
	 

	public static void main(String[] args) {
		System.out.print("The Fibbonacii siries for ");
		 Fibbonacci(4);
	        
	}

}
