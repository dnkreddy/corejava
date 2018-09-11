//Demo on Reflection API
import java.io.*;
import java.lang.reflect.*;
public class Lab413{
public static void main(String args[]){
	try{
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader bis = new BufferedReader(ir);
	System.out.println("Enter class Name");
	String clsName = bis.readLine();
    Class c1  = Class.forName(clsName);
	
	  //Method[] methods = c1.getMethods();
	  Object p = c1.newInstance();
	  
	  Method[] methods = c1.getDeclaredMethods();
	  
	  for(Method m : methods){
		  System.out.println("MethodName::"+m.getName()+"::"+Modifier.toString(m.getModifiers()));
		  
		Class[] types =  m.getParameterTypes();
		
		Object[] arg1s = new Object[types.length];
		int i = 0;
		for(Class type:types){
			System.out.println(type.getName());
			if(type.getName().equalsIgnoreCase("int")){
				arg1s[i] = new Integer(10);
			}else{
				arg1s[i] = "LAVI";
			}
			i++;
		}
		  m.invoke(p,arg1s);		  
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
	
	public  int print(int age){
		System.out.println("In print method::"+age);
		return age;
	}
	
	public void show(){
		System.out.println("In Show method");
	}	
	
	protected void getAge(){
		System.out.println("In getAge method");
	}
}


