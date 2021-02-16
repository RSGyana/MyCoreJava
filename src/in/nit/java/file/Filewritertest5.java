package in.nit.java.file;

import java.io.FileWriter;
import java.io.IOException;

public class Filewritertest5 {

	public static void main(String[] args) throws IOException {
		//FileWriter fw=new FileWriter("abc.txt");
		// all constructor
		//filewiter fw=new filewriter(string name);
		//filewriter fw=new filewriter(file name);
		//filewriter fw=new filewriter(boolean append);
		//filewriter fw=new filewriter(string name,boolean append);
		//all are for overriding file or explicitly append file
		//default is false=override,true ==append
	//	write(int ch)==to write a single char
				//write(char[] ch)==to write group of char
				//write(string s)==to write a string
	//flush()== to give guarentee that including last return to the file
		//close()==to close tthe writer
		FileWriter f=new FileWriter("abc.txt");
		f.write(100);
		f.write("hhgnbn");
		f.write('\n');
		char[] ch= {'a','c','s'};
		f.write(ch);
		f.write('\n');
		//f.flush();
		f.close();
		System.out.println("done");
//in above prog can perform overrideing oprn,instead of override we want append oprn
		//filewriter fw=new filewrieter(abc.txt,true)//true mean=append
	
	}

}
