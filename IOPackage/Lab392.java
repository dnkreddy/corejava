//Demo on FileWriter
import java.io.*;
public class Lab392{
public static void main(String args[])throws Exception{
	
	File f1 = new File("E:\\file.txt");
	f1.createNewFile();
	FileWriter fw = new FileWriter(f1);
	
	fw.write(97);
	fw.write(98);
	fw.write(99);
	
	char[] ch ={'L','A','V','I'};
	fw.write(ch);
	
	fw.write("This is Lavi Technologies");
	
	fw.flush();
	fw.close();
	
	
	
	
}
}