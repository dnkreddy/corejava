//Demo on ArrayList
import java.util.*;

public class Lab377{
public static void main(String args[]){
   List<Employee> list = new ArrayList<Employee>();
   
   Employee e1 = new Employee(100,"Lavi1");
   Employee e2 = new Employee(50,"Lavi1");
   Employee e3 = new Employee(40,"Lavi1");
   Employee e4 = new Employee(300,"Lavi1");
    	
   list.add(e1);
   list.add(e2);
   list.add(e3);
   list.add(e4);   
	
  System.out.println("size::"+list.size());//
  System.out.println("set::"+list);
  Collections.sort(list,new EidComparator());
   for(Employee emp:list){
	   System.out.println("EmpId::"+emp.eId);
   }
	
}
}
class Employee {
	
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