package in.nit.stringHandling;

public class SCPArea {

	
	//string object creation and its place
	
	public static void main(String[] args) {
		//string obj will create in heap area upto 1.6
		//in 1.7 string obj will create in heap and one copy will store 
		//SCP area 
		//so here two obj will create 
		//one copy will store in SCP Area bcz same content ''durga'' thats why
		//all are point to s1 obj bcz same content is present
		String s1=new String("durga ");
		String s2=new String("durga");
		String s3="durga";
				String s4="durga";
				System.out.println( s1+' '+s2+' '+s3+' '+s4);
				
				//in below program there ae 4 obj will create and 4 literal scp area
				
		String ss1=new String("spring"); 
		ss1.concat("fall"); //unrefenced  obj
				String ss2=ss1.concat("winter");
				ss2.concat("summer");  //unreferenced obj
				System.out.println(ss1);//spring
				System.out.println(ss2);//springwinter
				
		/*
		 * Heap area ==============SCp Area 
		 * =========                ======== 
		 * spring                    spring 
		 * springfall                fall 
		 * springwinter              winter 
		 * springwintersummer         summer
		 */
	}

}
