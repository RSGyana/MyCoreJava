package in.nit.java.file;

import java.io.File;

public class ListofFile {

	public static void main(String[] args) {
		int count=0;
		
		File f=new File("E:\\");
		String[] lst=f.list(); 
		for(String s1:lst) {
			//file f=new file();  to check all file only
		//	if(lst.isfileexist());
			count++;
			System.out.println(lst);
		}
System.out.println("total count"+count);
	}

}
