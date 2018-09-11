//Demo on Treeset with Employee
import java.util.*;
class Lab372{
public static void main(String args[]){
    
	Set<String> set = new TreeSet<String>();
	
	set.add("lavi1");
	set.add("lavi2");
	set.add("Bangalore");
	set.add("lavi3");
	set.add("lavi4");
	set.add("lavi5");
	set.add("lavi5");
	set.add("lavi5");
	//Tree not allows null values
	//set.add(null);

    System.out.println(set);
	Iterator it = set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}