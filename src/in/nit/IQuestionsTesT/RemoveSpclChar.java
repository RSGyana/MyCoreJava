package in.nit.IQuestionsTesT;


//TO REMOVE SPECL CHAR FROM A STRING
public class RemoveSpclChar {

	public static void main(String[] args) {
		
		String s="Ghu&^%^$imi";
		 
		// "^" this means other than any things will replace space
		String rem=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(rem);
		
		//Or directly write the special char
		String rem1=s.replaceAll("[@#$%^&*]","");
		System.out.println(rem1);
		
	

	}

}
