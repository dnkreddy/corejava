//Demo on List class
import java.util.*;
public class Lab368{
public static void main(String args[]){

List<String> list = new ArrayList<String>();
list.add("lavi1");
list.add("lavi2");
list.add("lavi4");
list.add("lavi5");
list.add("lavi6");
list.add("lavi7");

ListIterator listIte = list.listIterator();

while(listIte.hasNext()){
	System.out.println(listIte.next());
}
System.out.println("============");
while(listIte.hasPrevious()){
	System.out.println(listIte.previous());
}
	
}
}