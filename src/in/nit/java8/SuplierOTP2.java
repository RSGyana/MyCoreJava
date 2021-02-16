package in.nit.java8;

import java.util.function.Supplier;

public class SuplierOTP2 {
//genearte 6 digit otp randomly 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
				
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
