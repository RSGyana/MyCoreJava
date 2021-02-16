package in.nit.coreTest;


//constructor chaining 
//how can we invoke all constructor from one constructor
public class TEst1 {
TEst1(){
	
	System.out.println("from def const");

}
TEst1(int x){
	this();
	System.out.println("from 2nd const");
	
}
TEst1(String x,String y){
	this(10);
	System.out.println("from 3rd const");
}

TEst1(int x,String y){
	this("sd","vd");
	System.out.println("from 4th const");
}
	
	public static void main(String[] args) {
	
		System.out.println("hii");
		
		TEst1 t=new TEst1(10,"rfv");
		
		
	

	}

}
