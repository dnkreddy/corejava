//Demo on List class
import java.util.*;
public class Lab365{
public static void main(String args[]){

List<String> list = new ArrayList<String>();
list.add("lavi1");
list.add("lavi2");
list.add("lavi4");
list.add("lavi5");
list.add("lavi6");
list.add("lavi7");

List<String> subList = list.subList(2,5);
System.out.println("SubList::"+subList);	
}
}