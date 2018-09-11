//Demo on List class
import java.util.*;
public class Lab369{
public static void main(String args[]){

List<String> list = new ArrayList<String>();
list.add("lavi1");
list.add("lavi2");
list.add("lavi4");
list.add("lavi5");
list.add("lavi6");
list.add("lavi7");
Object[] arr = list.toArray();
for(Object s:arr){
	System.out.println(s);
}
	
}
}