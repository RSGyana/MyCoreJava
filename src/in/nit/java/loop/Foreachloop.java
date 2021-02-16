package in.nit.java.loop;

//for loop
//we can print data both direction, original oreder and reverse
//to retrive element is is compelex
//foreach loop
//we can print data in original order
//here retrive oprn is very easy

public class Foreachloop {

	public static void main(String[] args) {
		/*int[][] x= {{5,6,7},{3,4,5}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.println(x[i][j]);
			}}*/
		int[] x= {72,66,55,77,32};
		System.out.println(x.length);  //5
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
		//above case alternative so is not there in foreach loop
		
		//for(int[] x1:x) {
		//	for(int x2:x1)           //enhance for loop
			//	System.out.println(x2);
		//}

		
		/* for three dim enahance for loop
		 * for(int[][] x1:x) { for(int[] x2:x1) { for(int x3:x2) {
		 * System.out.println(x3); } } }
		 * 
		 *limitation 
		 *foreach loop is the best choice to retrieve element from array and collection
		 */
	}

}

