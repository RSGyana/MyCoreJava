package in.nit.coreTest;


public class Pattern6{ 
//print a pyramid 
	public static void main(String[] args) {

//i=row,j=space, k=column

		for(int i = 1; i<=4; i++) { 
			
			 for(int j=4; j>=i; j--) { 
				 System.out.print(" "); }
			 
			for(int k=1;k<=i;k++) {
				System.out.print("*");
	
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		//other way to print pyramids code reducedS
		for(int i = 1; i<=4; i++) { 
			
			 for(int j=4; j>=i; j--) { 
				 System.out.print(" "); }
			 
			for(int k=1;k<i*2;k++) {
				System.out.print("*");
	
			}
			
			System.out.println();
		}
	}
}

//****
 //***
  //**
   //*

