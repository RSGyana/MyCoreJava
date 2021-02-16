package in.nit.IQuestionsTesT;

import java.util.Scanner;


//annagrams means the same characters/string in disorder is called annagram
//ex==mymoteher=>othermom is annagram

public class AnnagramTest {
	
	public  boolean doCheckAnna(String s1,String s2) {
		int count =0;
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			
			for(int i=0;i<s1.length();i++) {
				count =count+s1.charAt(i);
			}
			
			for(int i=0;i<s2.length();i++) {
				count =count-s1.charAt(i);
			}
			
			return (count==0);
			
		}
			
		
	}
   public  void checkAnna(String s1,String s2) {
	   if(doCheckAnna(s1,s2))
	   {
		   System.out.println("both string are annagrame"); 
	   }
	   else {
		   System.out.println("both string are not annagrame");
	   }
   } 

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter fst string");
		String s1=scn.nextLine();
		System.out.println("enter 2nd string");
		String s2=scn.nextLine();
		
		new  AnnagramTest().
		checkAnna(s1,s2);
		
		

	}

}
