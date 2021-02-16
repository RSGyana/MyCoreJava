package in.nit.IQuestionsTesT;

public class ReverseString {

	public static void main(String[] args) {
		String s="ghoom";
		char[] charr=s.toCharArray();
		
	//	approach=1
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//	approach=2
		for(int i=charr.length-1;i>=0;i--) {
			System.out.print(charr[i]);
		}
		System.out.println();
		//	approach=3
		StringBuffer bf=new StringBuffer(s);
		System.out.println(bf.reverse());
		
		//	approach=4
		System.out.println();
		StringBuilder bd=new StringBuilder(s);
		System.out.println(bd.reverse());


	}

}
