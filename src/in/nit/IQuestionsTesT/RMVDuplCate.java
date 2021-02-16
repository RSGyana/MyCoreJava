package in.nit.IQuestionsTesT;

public class RMVDuplCate {
//remove duplicate letter 
	
	public static void main(String[] args) {
		
		String s="wel com e To GhaitaWorld";
		
		//distinct() =it will remove the duplicae char
		StringBuilder bd=new StringBuilder();
		s.chars().distinct().forEach(c->bd.append((char)c));
        System.out.println(bd);
	}

}
