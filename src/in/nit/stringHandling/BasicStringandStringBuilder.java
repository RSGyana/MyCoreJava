package in.nit.stringHandling;

public class BasicStringandStringBuilder {

	public static void main(String[] args) {
		//string is immutable because it non changeable
		//but stringBuffer and string Builder are mutable
		
		
		String s1=new String("jk");
		s1.concat("kumar"); //new obj created but unrefenced thats deletd 
		System.out.println(s1);  //jk //  non changeable
		
	//because s1 create obj in heap area and store 'jk'
  //s1.concat("kumar");=anoter obj created but unrefenced thats why ready for garbage collector 		

	StringBuilder sb=new StringBuilder("durga");	
	sb.append("soft");
	System.out.println(sb);// durgasoft
	
	// sb is chaneable thats why durga soft answer came

	}

}
