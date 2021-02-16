package in.nit.IQuestionsTesT;


//some time i will think about strting swaping
public class Swapping {
	
	public static  int m1(int a,int b) {
	
		System.out.println("the original value a\t"+a);
		System.out.println("the original value b\t"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value swapped a\t"+a);
		System.out.println("the value swapped a\t"+b);
		return 0;
		
	}

	public static void main(String[] args) {
	
		//Swapping s=new Swapping();
		m1(2,6);
	}

}
