//Demo on TreeMap class
import java.util.*;

public class Lab382{

public static void main(String args[]){
	
	Map<String,String> tMap1 = new  TreeMap<String,String>();
	tMap1.put("BB","lavi1");
	tMap1.put("AA","lavi5");
	tMap1.put("ZZZ","lavi3");
	tMap1.put("YYY","lavi4");
	tMap1.put("CCCC","lavi2");
	System.out.println("tMap1 size::"+tMap1.size());
	System.out.println("tMap1 ::"+tMap1);
	
	Map<Employee,String> tMap2 = new  TreeMap<Employee,String>();
	Employee e1 = new Employee(100);
	Employee e2 = new Employee(200);
	Employee e3 = new Employee(100);
	tMap2.put(e1,"Lavi1");
	tMap2.put(e2,"Lavi2");
	tMap2.put(e3,"Lavi3");
	System.out.println(tMap2.size()); 
	System.out.println(tMap2); 
	
}
}

class Employee implements Comparable{
	int eId;
	
	public Employee(int id){
		this.eId = id;
	}
	
	
	public int compareTo(Object obj){
		int result = 0;
		if(obj instanceof Employee){
			Employee e1 = (Employee)obj;
			if(this.eId - e1.eId>0){
				result = 1;
			}
			if(this.eId - e1.eId<0){
				result = -1;
			}
			
		}
		return result;
		
	}
}