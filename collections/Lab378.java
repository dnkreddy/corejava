//Demo on HashMap
import java.util.*;

public class Lab378{

public static void main(String args[]){
	
	Map<String,String> map = new  HashMap<String,String>();
	
	map.put("100","lavi1");
	map.put("500","lavi5");
	map.put("300","lavi3");
	map.put("400","lavi4");
	map.put("200","lavi2");
	
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	
    Map<String,String> map1 = new  HashMap<String,String>();
	
	map1.put("600","lavi6");
	
	map.putAll(map1);
	
	System.out.println(map.size());
	
    System.out.println(map.containsKey("100"));
	System.out.println(map.containsValue("lavi6"));
	System.out.println(map.containsValue("lavi7"));
	
	map.put("500","lavi7");
	map.put("600","lavi8");
	
	System.out.println("duplicates::"+map.size());
	System.out.println(map.get("600"));
	map.remove("600");
	System.out.println("After removing 600::"+map.get("600"));
	System.out.println("After removing 600::"+map.size());
	
	System.out.println(map);
	
	//Iteration of map
	
	Set<String> keys = map.keySet();
	for(String key:keys){
		System.out.println("value::"+map.get(key));
	}
	
	Set<Map.Entry<String,String>> entrySet= map.entrySet();
	
	for(Map.Entry entry:entrySet){
		
		System.out.println("key::"+entry.getKey());
		System.out.println("value::"+entry.getValue());
		
	}
	
}
}