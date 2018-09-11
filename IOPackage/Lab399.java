//Demo on FileInputand OutStream
import java.io.*;
public class Lab399{
public static void main(String args[])throws Exception{
	
	File f = new File("E:\\file3.txt");
	FileOutputStream fos1 = new FileOutputStream(f);
	int z = 100;
	fos1.write(z);
	byte[] bArray = {98,99,100,101};
	fos1.write(bArray);
	String val = "this is lavi technilogies";
	byte[] bytes =val.getBytes();
	fos1.write(bytes);
	fos1.flush();
	fos1.close();
	
	FileOutputStream fos2 = new FileOutputStream("E:\\file4.txt");
	FileInputStream fis = new FileInputStream("E:\\file3.txt");
	int i = fis.read();
	 while(i != -1){
		 System.out.println("Data:"+i);
		 fos2.write(i);
		 fos2.flush();
		 i = fis.read();
	 }
	
	fis.close();
	fos2.close();
	
}
}