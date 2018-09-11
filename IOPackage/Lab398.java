//Demo on BufferedReader
import java.io.*;
public class Lab398{
public static void main(String args[])throws Exception{
	
	File f = new File("E:\\file2.txt");
	FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
	
	String line = br.readLine();
	while(line != null){
		System.out.println(line);
		line = br.readLine();
	}
	
	
}
}