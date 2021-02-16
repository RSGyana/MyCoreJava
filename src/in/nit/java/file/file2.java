package in.nit.java.file;

import java.io.File;

public class file2 {

	public static void main(String[] args) {
		//java file io concept use based unix os system
		//java file can represent file and dir
		File f=new File("acb.text");
		System.out.println(f.exists());//fst -false again run 2nd ==true bcz file created
		f.mkdir();
		System.out.println(f.exists());

	}

}
