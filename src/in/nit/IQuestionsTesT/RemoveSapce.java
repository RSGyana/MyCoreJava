package in.nit.IQuestionsTesT;


//to remove white spaces from string 
public class RemoveSapce {

	public static void main(String[] args) {
		String s= " H ell o Du de  ";
				System.out.println(s);
				//System.out.println(s.trim());//trim method will remove all space fst and last

	String rmvspc=s.replaceAll("\\s",""+"");
	System.out.println(rmvspc);
				
	}

}
