package in.nit.java8;

public class runableusingLAMBDAExprs {
	public static void main(String[] args) {
		//where we will found anonymous innner class we can use lambda exp
		Thread t=new Thread(()-> {
			for(int i=0;i<10;i++) {
				System.out.println("child class");
			}
		});
		t.start();
		for(int i=0;i<12;i++) {
		System.out.println("main thread");
		}
		
		}
	}

/* directly we are passing runnable  as argument in thread constructor instead of ref var 
 * Runnable r=()-> { for(int i=0;i<10;i++) { System.out.println("child class");
 * } }
 */

//IN LAMBDA EXPS CODE WILL BE REDUCED /CODE OPTIMIZED
//NO NEED WRITE UNNECESARY THNGS
