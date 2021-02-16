package in.nit.stringHandling;

public class StringArray {
	public static void main(String[] args) {

		/*
		 * int count=0; String[] files= {"1.txt","2.doc","3.exe","4.txt"}; for(int
		 * i=0;i<=files.length;i++) { if(files[i].endsWith(".txt")) { count++; } } 
		 * System.out.println(count+"text files are available");
		 */
		String s1="aaa abb abc bbb bbc bca ccc cca cab cba bac bac ";
		System.out.println(s1.startsWith("aaa")); //true bcz start with aaa,incase we will other string ans will false
		System.out.println(s1.startsWith("aaa ab"));//ans true bcz string check starts with this string or not
		
		System.out.println(s1.endsWith("bac"));//result false bcz we have provided one space at the last of the senetence thats why
	}
}
