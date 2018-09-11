//Demo on MethodOveriding
import java.io.*;
class Lab269{
public static void main(String args[])throws Exception{
	 File1 f = new File2();
	 //f.readFile("JDBC");
	 f.readFile();
	 
}
}
 class File1{
  public void readFile()
 {
		System.out.println("File1 reding file");
 }	
 public void writeFile(){
	 System.out.println("File Writing");
 }
}
class File2 extends File1{
 public void readFile(String name)
 {
		System.out.println("File2 reding file");
 }
}
