//Demo on FileWriter
import java.io.*;
public class Lab396{
public static void main(String args[])throws Exception{
	
	FileWriter fw = new FileWriter("E:\\file2.txt");
	PrintWriter pw = new PrintWriter(fw);
	pw.println(97);
	pw.println(98);
	pw.println(99);
	pw.println(99.99);
	
	char[] ch ={'L','A','V','I'};
	pw.println(ch);
	
	pw.println("This is Lavi Technologies");
	pw.flush();
	pw.close();
	
	
	
	
}
}