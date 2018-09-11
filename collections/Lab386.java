//Demo on Locale and ResourceBundle utility class
import java.util.*;
public class Lab386{
public static void main(String args[]){
	
	//en_US
	Locale loc = Locale.getDefault();
	System.out.println(loc);
	
	//hi_US
	Locale loc1 = new Locale("hi","US");
	System.out.println(loc1);
	
	ResourceBundle rs1 = ResourceBundle.getBundle("message",loc);
	System.out.println(rs1.getString("name"));
}
}