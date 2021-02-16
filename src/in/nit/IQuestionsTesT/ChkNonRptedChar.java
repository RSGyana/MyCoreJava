package in.nit.IQuestionsTesT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//to check first non repeating char/letter and display


public class ChkNonRptedChar {

	public static void main(String[] args) {
		boolean unique=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		String s=sc.nextLine();


		/*
		 * for(int i=0;i<s.length();i++) { for(int j=0;j<s.length();j++) {
		 * 
		 * if(i!=j && s.charAt(i)==s.charAt(j)) { unique=false;
		 * 
		 * } }
		 * 
		 * 
		 * if(unique) { System.out.println(s.charAt(i)); break; }
		 * 
		 * }
		 */
		//by using collection

		Map<Character,Integer> m=new HashMap();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);

			if(m.containsKey(ch)) {
				m.put(ch,m.get(ch)+1);
			}
			else{
				m.put(ch,1);
			}

		}
		System.out.println(m);
		for(java.util.Map.Entry<Character,Integer> entryset:m.entrySet()) {
			if(entryset.getValue()==1) {
			System.out.println(entryset.getKey());
			break;
			}
		}

	}
}



