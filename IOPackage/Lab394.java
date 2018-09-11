//Demo on FileWriter
import java.io.*;
public class Lab394{
public static void main(String args[])throws Exception{
	
	File f1 = new File("E:\\file.txt");
	f1.createNewFile();
	FileWriter fw = new FileWriter(f1,true);
	//FileWriter fw = new FileWriter("E:\\file2.txt",true);
	fw.write(97);
	fw.write("\n");
	fw.write(98);
	fw.write("\n");
	fw.write(99);
	fw.write("\n");
	
	char[] ch ={'L','A','V','I'};
	fw.write(ch);
	fw.write("\n");
	
	fw.write("This is Lavi Technologies");
	
	fw.flush();
	fw.close();
	
	
	
	
}
}