package in.nit.java8;
interface Interf{
	public void m1();
}

public class DiiffinnerclassAndLambdaExps {
	int x=111;
	public void m2() {
		Interf i=
				/*// INNER CLASS OBJ ALWAYS FOLLOW CURRNET CLASS OBJ MEAN LOCAL INSTANCE  VAR
				 * new Interf() {
				 * 
				 * int x=11; public void m1() {
				 * 
				 * System.out.println(this.x); } };
				 */
				
				// IN LAMBDA EXPRESSION CASE ALAWAYS FOLLOWS OUTER CLASS VAR MEAN CLASS LEVEL VAR
				//BCOZ LAMBDA  HAS NO OBJ
				()->{
					int x=11;
					System.out.println(this.x);
				};
				i.m1();
	}
	public static void main(String[] args) {
		DiiffinnerclassAndLambdaExps t=new DiiffinnerclassAndLambdaExps();
		t.m2();
	}



}
