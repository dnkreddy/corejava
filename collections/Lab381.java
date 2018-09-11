//Demo on HashMap class
import java.util.*;

public class Lab381{

public static void main(String args[]){
	
	Map<Employee,String> hMap = new  HashMap<Employee,String>();
	Employee e1 = new Employee(100);
	Employee e2 = new Employee(200);
	Employee e3 = new Employee(100);
	
	hMap.put(e1,"Lavi1");
	hMap.put(e2,"Lavi1");
	hMap.put(e3,"Lavi3");
	System.out.println(hMap.size()); 
	
}
}

class Employee{
	int eId;
	
	public Employee(int id){
		this.eId = id;
	}
	
	
	public int hashCode(){
		return eId;
	}
	
	public boolean equals(Object obj){
		boolean result = false;
		if(obj instanceof Employee){
			Employee e1 = (Employee)obj;
			if(this.eId == e1.eId){
				result = true;
			}
			
		}
		return result;
		
	}
}