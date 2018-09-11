//Demo on HashSet
import java.util.*;
class Lab370{
public static void main(String args[]){
    
	Set<String> set = new HashSet<String>();
	set.add("lavi1");
	set.add("lavi2");
	set.add("Bangalore");
	set.add("lavi3");
	set.add("lavi4");
	set.add("lavi5");
	set.add("lavi5");
	set.add("lavi5");
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