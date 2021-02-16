package in.nit.java.file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		System.out.println(f.exists());  //respective file is not there
     //System.out.println( f.createNewFile());//here create 
      System.out.println(f.exists());
	}

}
 