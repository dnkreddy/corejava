//Demo on List class
import java.util.*;
public class Lab366{
public static void main(String args[]){

List<String> list = new ArrayList<String>();
list.add("lavi1");
list.add("lavi2");
list.add("lavi4");
list.add("lavi5");
list.add("lavi6");
list.add("lavi7");

List<String> list1 = new ArrayList<>();
list1.add("lavi4");
list1.add("lavi5");
System.out.println(list.containsAll(list1));

list.removeAll(list1);
System.out.println(list);

	
}
}