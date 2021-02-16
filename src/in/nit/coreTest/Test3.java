package in.nit.coreTest;

import java.util.Random;

//print randomly 20 number in range 100-200

public class Test3{
	public static void main(String[] args) {
		int count=0;  
		Random r=new Random();

		for(int i=0;i<1000;i++) {

			int x=r.nextInt(200);

			if(x>=100 && x<=200 ) {

				System.out.println(x);
				count++;
				if(count==20) {
					break;
				}
			}
		
		}
		System.out.println("count is\t"+count);
	}
}

