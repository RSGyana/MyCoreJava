package in.nit.IQuestionsTesT;

import java.util.Scanner;

public class PallinDrome {
	
	  public static void m1() { 
		  String original, reverse = ""; // Objects of String class
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter a string/number to check if it is a palindrome");
	  original = in.nextLine(); 
	  int length = original.length();
	  //System.out.println(length); 
	  for ( int i = length - 1; i >= 0; i-- ) 
		  reverse = reverse + original.charAt(i);
	  System.out.println("this is the reverse string \t"+reverse);
	  
	  if (original.equals(reverse))
	  System.out.println("Entered string/number \t'"+original+"' is a palindrome.");
	  else
	  System.out.println("Entered string/number \t"+original+" isn't a palindrome."
	  );
	  
	  }
	 

	public static void main(String[] args) {
		m1();
	}
}
/*
static boolean isPalindrome(String str) 
{ 

    // Pointers pointing to the beginning 
    // and the end of the string 
    int i = 0, j = str.length() - 1; 

    // While there are characters toc compare 
    while (i < j) { 

        // If there is a mismatch 
        if (str.charAt(i) != str.charAt(j)) 
            return false; 

        // Increment first pointer and 
        // decrement the other 
        i++; 
        j--; 
    } 

    // Given string is a palindrome 
    return true; 
} */
