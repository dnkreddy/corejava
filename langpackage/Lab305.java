//Demo on System class
import java.util.*;
class Lab305{
public static void main(String args[]){
	long milliScs = System.currentTimeMillis();
	Date d = new Date(milliScs);
	System.out.println(d);
	//0 normal termination
	//other than 0 abnormal termination
	System.exit(1);
	String name = System.getProperty("os.name");
	System.out.println(name);
	Properties ps = System.getProperties();
	Enumeration e = ps.propertyNames();
	while(e.hasMoreElements()){
		String key = e.nextElement().toString();
		String value = System.getProperty(key);
		System.out.println(key+"::"+value);
	}
	System.gc();
	System.runFinalization();
}
}

