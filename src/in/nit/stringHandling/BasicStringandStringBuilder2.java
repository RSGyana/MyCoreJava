package in.nit.stringHandling;

public class BasicStringandStringBuilder2 {

	//there are 12 methodss in object class
	//and one is private
	
	//== and euals method discussion
	
	public static void main(String[] args) {
		
		String s1=new String("jk");
		String s2=new String("jk");
		
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(s2));//true 
		//bcz string class is overriden the equals method in class
		//thats why true data/content wise comparision
		
		StringBuilder sb1=new StringBuilder("durga");
		StringBuilder sb2=new StringBuilder("durga");
		
		System.out.println(sb1==sb2); //false 
		
		System.out.println(sb1.equals(sb2));//false
		
		//bcz stringbuilder is not overriden the equals method in class
		//thats why compare refence wise thats why answer "false"
		
	}

}
