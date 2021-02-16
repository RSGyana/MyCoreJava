package in.nit.java.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriterTest {

	public static void main(String[] args) throws IOException {
		//constructor
	//	PrintWriter pw=new PrintWriter(string name);
	//	PrintWriter pw=new PrintWriter(file name);
	//	PrintWriter pw=new PrintWriter(writer name);
				
				//print  writer can comm direct with file 
				//can comm via writer obj also
				
				//methods
		
		//what ever methods in file wrieter are directly available to printwriter

		FileWriter fw=new FileWriter("abc.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(200);
		
		pw.println(1000);
		pw.println(true);
		pw.println("jk");
		System.out.println(pw);
		pw.flush();
		pw.close();
		 //recomend reader file//buffer reader
		//writer===printwriter
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
