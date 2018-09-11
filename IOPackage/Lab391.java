//Demo on File class
import java.io.*;
public class Lab391{
public static void main(String args[])throws Exception{
	
 File f1 = new File("E:\\lavi1.txt");
 System.out.println(f1.exists()); 
 f1.createNewFile();
 System.out.println(f1.exists());
 
 File f2 = new File("E:\\LAVI2\\LAVI1");
  f2.mkdirs();
  
 File f3 = new File("E:\\LAVI1");
 File[] files =  f3.listFiles(new JavaFilter(".java")); 
	
	for(File f :files){
		//if(f.getName().endsWith(".java"))
		System.out.println(f.getName());
	}
	
	
}
}
class JavaFilter implements FileFilter{
	String ext;
	public JavaFilter(String fileType){
		this.ext = fileType;
	}
	
	public boolean accept(File f){
		return f.getName().endsWith(ext);
	}
}