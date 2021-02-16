package in.nit.java8;


//constructor referencing 
  //classname::new

interface interf1{
	public Sample m1();
}
class Sample{
	Sample(){
		System.out.println("initialize and obj created");
	}
}
public class methodrefrence3 {

	public static void main(String[] args) {
		interf1 i1=Sample::new;
		Sample s=i1.m1();

	}

}
