//Demo on FileWriter
import java.io.*;
public class Lab395{
public static void main(String args[])throws Exception{
	
	
	FileWriter fw = new FileWriter("E:\\file2.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(97);
	bw.newLine();
	bw.write(98);
	bw.newLine();
	bw.write(99);
	bw.newLine();
	
	char[] ch ={'L','A','V','I'};
	bw.write(ch);
	bw.newLine();
	
	bw.write("This is Lavi Technologies");
	
	bw.flush();
	bw.close();
	
	
	
	
}
}