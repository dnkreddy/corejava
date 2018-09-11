//Demo on BufferedStream class
import java.io.*;
public class Lab400{
public static void main(String args[])throws Exception{
	
	File f = new File("E:\\file3.txt");
	FileOutputStream fos1 = new FileOutputStream(f);
	BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
	int z = 100;
	bos1.write(z);
	byte[] bArray = {98,99,100,101};
	bos1.write(bArray);
	String val = "this is lavi technilogies";
	byte[] bytes =val.getBytes();
	bos1.write(bytes);
	bos1.flush();
	bos1.close();
	
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