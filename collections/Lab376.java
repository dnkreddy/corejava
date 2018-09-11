//Demo on Treeset
import java.util.*;

public class Lab376{
public static void main(String args[]){
   Set<Employee> empSet = new TreeSet<Employee>(new EidComparator());
   
   Employee e1 = new Employee(100,"Lavi1");
   Employee e2 = new Employee(50,"Lavi1");
   Employee e3 = new Employee(40,"Lavi1");
   Employee e4 = new Employee(300,"Lavi1");
    	
   empSet.add(e1);
   empSet.add(e2);
   empSet.add(e3);
   empSet.add(e4);   
	
  System.out.println("size::"+empSet.size());//
  System.out.println("set::"+empSet);
  
   for(Employee emp:empSet){
	   System.out.println("EmpId::"+emp.eId);
   }
	
}
}
class Employee{
	
	int eId;
	String eName;
	
	public Employee(int id, String name){
		this.eId = id;
		this.eName = name;
	}	
}
class EidComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.eId-e2.eId;
	}
	
}