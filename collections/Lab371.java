//Demo on LinkedHashSet
import java.util.*;
class Lab371{
public static void main(String args[]){
    
	Set set = new LinkedHashSet();
	set.add("lavi1");
	set.add("lavi2");
	set.add("Bangalore");
	set.add("lavi3");
	set.add("lavi4");
	set.add("lavi5");
	set.add("lavi5");
	set.add("lavi5");
	set.add(100);
	set.add(null);
	set.add(null);
	set.add(null);
	
    System.out.println(set);
	Iterator it = set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}