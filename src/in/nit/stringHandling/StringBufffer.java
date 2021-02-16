package in.nit.stringHandling;

public class StringBufffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer sb=new StringBuffer("gyananendrakuanr"); sb.insert(5,",");
		 * System.out.println(sb); char[] ch= {'g','y','a','n','a'};
		 * System.out.println(ch);
		 */
		
		String s1="HARI";  //String is immutable,WE CANT MODIFY,IF WE WANT ADD DATA IN FUTURE IN
		//EXSHISTING OBJ THEN NEW OBJ WILLL CREATED DATA WILL BE APPEND WITH NEW OBJ,MEMORY ISSUE
		//BUT WE HAVE TAKEN STRING IMMUTABLE FOR MAP COLLECTION,BCZ KEY IS STRING THATS WHY
		String s2=s1.concat("ni t");
		System.out.println(s1.length());
		System.out.println(s1.isBlank());
		System.out.println(s2.trim());//result is pending
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('I'));
		System.out.println(s1.replace('H','N'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf("RI")); //always first index value will print
		System.out.println(s1.lastIndexOf("I"));
		String s3=s1+"sri";
		System.out.println(s3);
		System.out.println(s1==s3);
		
		 
		System.out.println("----------------------------");
		System.out.println(s1);
	
		System.out.println(s2);
		/*
		 * System.out.println(s2.hashCode()); System.out.println(s1.hashCode());
		 * System.out.println(s1.getClass().getName());
		 * System.out.println(s2.getClass()); //STRING BUFFER(thread safe and
		 * sychronized) IS MUTABLE THAT MEANS WE CAN MODIFY AND STORE DATA INTO THAT
		 * OBJECT,FURTHER NEW OB WILL NOT CREATED, //PERFORMANCE IS GOOD ,MEMORY REDUCED
		 * StringBuffer sb1=new StringBuffer("gyana"); StringBuffer
		 * sb2=sb1.append("kumar"); System.out.println(sb1); System.out.println(sb2);
		 * 
		 * //stringBuilder is (noo-threadsafe and non-synch) mutable,we can access
		 * multiple methods at a time in a local method performance wise better than
		 * stringbuffer
		 * 
		 * StringBuilder sb3=new StringBuilder("rsgyana"); StringBuilder
		 * sb4=sb3.append("kumar"); System.out.println(sb3); System.out.println(sb4);
		 */
		 
		
	}

}
