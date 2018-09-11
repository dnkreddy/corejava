//Demo on MethodOveriding
import java.io.*;
class Lab265{
public static void main(String args[])throws Exception{
	 File1 f = new File1();
	 f.readFile();
}
}

class File1{
 public void readFile()throws IOException
 {
		System.out.println("reding file");
 }	
}
class File2 extends File1{
 public void readFile()throws FileNotFoundException,
 ArithmeticException
 {
		System.out.println("reding file");
 }
}
