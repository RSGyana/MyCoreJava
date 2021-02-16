package in.nit.java.file;

import java.io.FileReader;

public class bufferWriterTestReader {

	public static void main(String[] args) {
	//bufferwriter 
		//new line placing in filewriter problem solved bufferwriter
		//we are using write char to the file
		// but we cant write directly to file
		//with the help of file writer we can write
		//BufferWriter bw=new bufferwriter("abc.txt");//wrong
		//BufferWriter bw=new bufferwriter(new filewriter("abc.txt"));//right
		//also we can the buffer size in constructor
		//bw b=new bw(string name,int bsize);
//buufferreader
		
		//for reading purpose
		//it cant read file directly
		//it wil read file through filereader obj
		
		//FileReader fr=new FileReader("abc.txt");
		//bufferreader br=new bufferreader(fr);
		//br b=new br(string name,int bsize);
		//not required to close the file
		
		//the most enahance reader to read char to the file is "bufferreader"
	}

}
