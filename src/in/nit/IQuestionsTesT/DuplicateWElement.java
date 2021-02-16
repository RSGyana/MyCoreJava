package in.nit.IQuestionsTesT;

import java.util.HashSet;
import java.util.Set;





//wap to find out duplicate and then sort the eleemnt

public class DuplicateWElement {
//print the duplicate element
	
	public static void main(String[] args) {
		int[] a= {3,4,4,8,0,3,6,6};
	    
	
		Set s=new HashSet<>();
		for(int i=0;i<a.length;i++) {
		
			if(s.add(a[i])==false) {
				System.out.println("duplicate elements\t"+a[i]);
			
			}
			else {
				//System.out.println("single elements\t"+a[i]);
			}
			
		}
		

	}

}
