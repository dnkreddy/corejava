//Demo on Collections utility class
import java.util.*;
public class Lab383{
public static void main(String args[]){
	
    List<String> list = new ArrayList<>();
    list.add("Naveen");
	list.add("Aswini");
	list.add("kumar");
    list.add("Narendra");
	System.out.println(list);
    Collections.sort(list);
    System.out.println("=============");	 
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println("==after shuffling==");	
	System.out.println(list);
	System.out.println("==after roating==");	
	Collections.rotate(list,1);
	System.out.println(list);
	System.out.println("==after roating==");	
	Collections.rotate(list,-1);
	System.out.println(list);
	
}
}