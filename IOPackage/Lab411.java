//Demo on Reflection API
import java.io.*;
public class Lab411{
public static void main(String args[]){
	try{
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader bis = new BufferedReader(ir);
	
	System.out.println("Enter class Name");
	
	String clsName = bis.readLine();
	
	
        Class c1  = Class.forName(clsName);
		Object ob = c1.newInstance();
		
		System.out.println("Object::"+ob);
		
		
		Class c2 = Person.class;
		System.out.println("c2::"+c2);
		
		Class c3 = int.class;
		System.out.println("c3::"+c3);
		 
	    Person p1 = new Person();
	    Class c4 = p1.getClass();
		 
		 
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	
}
}

