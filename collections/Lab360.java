import java.util.*;
//Demo on vector class
class Lab360{
public static void main(String args[]){	
 Vector vector = new Vector();	
	vector.add("Lavi1");
	vector.add("Lavi2");
	vector.add("Lavi3");
	vector.add("Lavi4");
	vector.add("Lavi5");
	Enumeration e = vector.elements();
	while(e.hasMoreElements()){
		System.out.println(e.nextElement());
	}
}
}