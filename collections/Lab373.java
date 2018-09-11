//Demo on HashSet with Employee
import java.util.*;

public class Lab373{
public static void main(String args[]){
   Set<Employee> empSet = new HashSet<Employee>();
   
   Employee e1 = new Employee(100,"Lavi1");
   Employee e2 = new Employee(100,"Lavi1");
   Employee e3 = new Employee(100,"Lavi1");
   Employee e4 = new Employee(100,"Lavi1");
    	
   empSet.add(e1);
   empSet.add(e2);
   empSet.add(e3);
   empSet.add(e4);   
	
  System.out.println("size::"+empSet.size());
  
  System.out.println("set::"+empSet);
	
	
}
}


class Employee{
	
	int eId;
	String eName;
	
	public Employee(int id, String name){
		this.eId = id;
		this.eName = name;
	}
	
	public int hashCode(){
		return eId;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Employee){
			Employee other = (Employee)obj;
			if(this.eId == other.eId){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
}