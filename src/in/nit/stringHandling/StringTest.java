package in.nit.stringHandling;

public class StringTest {

	
	public static void main(String[] args) {
		
		/*
		 * String s1=" abc "; System.out.println(s1.toUpperCase());
		 * System.out.println(s1); String s2=s1.trim();//WE CANT MODIFY S1 OBJ BCZ
		 * STRING IMMUTABLE, THATS WHY ,WE SHOULD MODIFY THAT IN ANOTHER OBJ
		 * System.out.println(s2); String s3=s1.toLowerCase();
		 * System.out.println(s1==s3);//true s3 pointing to same obj
		 * System.out.println(s1==s2);// false bcz s2 contain modified value thats why
		 * false
		 */
		/*
		 * Scanner scn=new Scanner(System.in);
		 * System.out.println("enter a number---------"); String data=scn.nextLine();
		 * int noofchar=data.length(); System.out.println("string is ---"+data);
		 * 
		 * for(int i=0;i<noofchar;i++) {
		 * 
		 * System.out.println("char position---"+(i+1));
		 * 
		 * }
		 */
		 
		
		
		  String s1="welcome to java world  lazy a quick broown fox jumps over the lazy dog"; System.out.println(s1.indexOf('a'));
		  System.out.println(s1.indexOf("java"));
		  System.out.println(s1.lastIndexOf('a'));
		  System.out.println(s1.lastIndexOf('d'));
		  System.out.println(s1.lastIndexOf("World")); //-1 ans result bcz we searched"World" but 
		  //present "world" so thats why return -1 ,so from above that we concluded that we should search exact string/char  
		   
		  // o/p 12 11 14 20 -1
		  System.out.println(s1.indexOf('a', 7));//12
		  System.out.println(s1.indexOf('c', 7));//-1
		  //we are searching ch 'c' from index 7 onwards
		  //if jvm will not found then -1 will return
		  System.out.println(s1.lastIndexOf('a',17));//14 last ch 'a' index will be return
		  System.out.println(s1.lastIndexOf("lazy", 53));//it will search upto 53 index and will return from last exact string 
		  System.out.println();
		  System.out.println();
		  System.out.println();
		 


	}

}
