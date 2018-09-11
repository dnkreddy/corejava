//Demo on Reflection API
import java.io.*;
import java.lang.reflect.*;
public class Lab412{
public static void main(String args[]){
	try{
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader bis = new BufferedReader(ir);
	System.out.println("Enter class Name");
	String clsName = bis.readLine();
	
    Class c1  = Class.forName(clsName);
	
	  //Method[] methods = c1.getMethods();
	  Method[] methods = c1.getDeclaredMethods();
	  for(Method m : methods){
		  System.out.println("MethodName::"+m.getName()+"::"+Modifier.toString(m.getModifiers()));
		  
	  }
	  
	  
	  //Field[] fields = c1.getFields();
	  Field[] fields = c1.getDeclaredFields();
	  for(Field f : fields){
		  System.out.println("FieldName::"+f.getName()+"::"+Modifier.toString(f.getModifiers()));
		  
	  } 
		 
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	
}
}

class Person{
	static{
		System.out.println("Person static block");
	}
	
	private int age;
	public String name;
	protected long phoneNo;
	
	private void print(){
		System.out.println("print method");
	}
	public void show(){
		System.out.println("Show method");
	}	
	protected void getAge(){
		System.out.println("getAge method");
	}
	
}