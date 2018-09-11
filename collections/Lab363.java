//Demo on List class
import java.util.*;
public class Lab363{
public static void main(String args[]){

List<String> list = new ArrayList<String>();
list.add("lavi1");
list.add("lavi2");
list.add("lavi4");
list.add("lavi5");	
System.out.println(list);

List<String> list1 = new ArrayList<String>();
list1.add("100");
list1.add("300");
list1.add("200");
System.out.println(list1);
list.addAll(list1);
System.out.println(list);

	
	
}
}