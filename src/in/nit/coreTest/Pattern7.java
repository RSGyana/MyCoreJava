package in.nit.coreTest;


public class Pattern7{ 
//print a reverse pyramid 
	public static void main(String[] args) {

//i=row,j=space, k=column
//in this first triangle for space,second =* and THird =*
		for(int i = 1; i<=4; i++) { 
			
			 for(int j=1; j<=i; j++) { 
				 System.out.print(" "); }
			 
			for(int k=4;k>=i;k--) {
				System.out.print("*");
	
			}
			for(int l=3;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//for another way 
		for(int i = 1; i<=4; i++) { 
			
			 for(int j=1; j<=i; j++) { 
				 System.out.print(" "); }
			 
			for(int k=9;k>i*2;k--) {
				System.out.print("*");
	
			}
			
			System.out.println();
		}
		
		//another way
		for(int i=5; i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
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

