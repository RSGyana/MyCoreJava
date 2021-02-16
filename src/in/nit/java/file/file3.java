package in.nit.java.file;

import java.io.File;

public class file3 {

	public static void main(String[] args) {
		//file class constructor
		/*
		 * 1 File f=new File(string name); cretaes file name in current working dir file
		 * 2 f=new file(string subdir,string name); //creates jav file obj name of the
		 * 3 file /dir present in sub dir file f=new file(file subdir,string name);
		 * 
		 */
		//crete a file abc.txt in cuurent woring dir
	File f=new File("abc.txt");
	f.mkdir();
	//create a file in current dir and the file demo.txt
	File f1=new File("abc.txt","demo.txt");
	File f2=new File(f,"demo1.txt");
	}

}
//isfiel()==to check file or not
//is directory()==is dir or not\
//cretenew file==crete file and retrurn true
//mkdir()==crete dir and return true
//exist()
//delete()
//list()




