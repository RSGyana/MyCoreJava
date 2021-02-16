package in.nit.coreTest;


public class Pattern5{ 
//print a triangle 
	public static void main(String[] args) {

//i=row,j=space, k=column

		for(int i = 1; i<=4; i++) { 
			
			 for(int j=4; j>=i; j--) { System.out.print(" "); }
			 
			for(int k=1;k<=i;k++) {
				//System.out.print(" *");
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}
}

//****
 //***
  //**
   //*

