//Reading and writing image with Stream classes
import java.io.*;
class Lab402{
public static void main(String args[])throws Exception
{
    /*File f1 = new File("E:\\lavi\\Naveen\\CoreJava\\LAVI\\car.jpg");  
    FileReader fis = new FileReader(f1);
	char[] res = new char[(int)f1.length()];
	fis.read(res);
	
	File f2 = new File("E:\\lavi\\Naveen\\CoreJava\\LAVI\\car1.jpg");
    f1.createNewFile(); 
    FileWriter fos = new FileWriter(f2);
	fos.write(res);
	
	fis.close();
	fos.flush();
	fos.close();*/
	
    File f1 = new File("E:\\lavi\\Naveen\\CoreJava\\LAVI\\car.jpg");  
    FileInputStream fis = new FileInputStream(f1);
	byte[] res = new byte[(int)f1.length()];
	fis.read(res);
	File f2 = new File("E:\\lavi\\Naveen\\CoreJava\\LAVI\\car1.jpg");
    f1.createNewFile(); 
    FileOutputStream fos = new FileOutputStream(f2);
	fos.write(res);
	fis.close();
	fos.flush();
	fos.close();
	       
}
}