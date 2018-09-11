//Demo on Queue utility class
import java.util.*;
public class Lab389{
public static void main(String args[]){
	
	String val = "This is lavi technologies located in bangalore";
	StringTokenizer st = new StringTokenizer(val);
	while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
	}
	
	String val1 = "Naveen,30,90366,Bangalore,560016";
	StringTokenizer st1 = new StringTokenizer(val1,",");
	while(st1.hasMoreTokens()){
		System.out.println(st1.nextToken());
	}
}
}

