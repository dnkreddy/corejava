//Demo on MethodOveriding
import java.io.*;
class Lab271{
public static void main(String args[])throws Exception{
	 File1 f = new File2();
	 f.readFile();	 
}
}
 class File1{
  public static void readFile()
 {
		System.out.println("File1 reding file");
 }	
 public void writeFile(){
	 System.out.println("File Writing");
 }
}
class File2 extends File1{
 public static void readFile()
 {
		System.out.println("File2 reding file");
 }
 public void writeFile(){
	 System.out.println("File Writing");
 }
}
