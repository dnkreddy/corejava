//Demo on MethodOveriding
import java.io.*;
class Lab267{
public static void main(String args[])throws Exception{
	 File1 f = new File1();
	 f.readFile();
}
}

class File1{
 final public void readFile()
 {
		System.out.println("reding file");
 }	
}
class File2 extends File1{
 public void readFile()
 {
		System.out.println("reding file");
 }
}
