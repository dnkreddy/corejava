//Demo on Collection class
import java.util.*;
class Lab361{
public static void main(String args[]){
    Collection col = new ArrayList();
	col.add("lavi1");
	col.add("lavi2");
	col.add("lavi3");
	col.add("lavi4");
	col.add("lavi5");
    System.out.println(col);
	Iterator it = col.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}