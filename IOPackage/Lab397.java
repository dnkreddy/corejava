//Demo on FileReader
import java.io.*;
public class Lab397{
public static void main(String args[])throws Exception{
	
	File f = new File("E:\\file2.txt");
	FileReader fr = new FileReader(f);

	int ch = fr.read();
	System.out.println((char)ch);
	
	while(ch != -1){
		System.out.println((char)ch);
		ch = fr.read();
	}
	
	
	//2nd way of reading data
	FileReader fr1 = new FileReader("E:\\file2.txt");
	char[] ch1 = new char[(int)f.length()];
	fr1.read(ch1);
	for(char c:ch1){
		System.out.println("Array::"+c);
	}
	
}
}