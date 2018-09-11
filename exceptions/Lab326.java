//Demo on types of Exceptions
import java.io.*;
class Lab326{
public static void main(String args[]){
	try{
	File f = new File("D:\\lavi.txt");
	f.createNewFile();
	}catch(IOException ex){
		ex.printStackTrace();
	}catch(FileNotFoundException ex){
		ex.printStackTrace();
	}
}
}