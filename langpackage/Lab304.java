//Demo on Wrapper classes
class Lab304{
public static void main(String args[]){
 	//primitive values
	int x = 10;
	//Integer iObj = x;
	//primitive to wrapper object
	Integer iObj = new Integer(x);
	System.out.println(iObj);
	Integer iObj1 = Integer.valueOf(x);
    System.out.println(iObj1);	
	//Wrapper to primitive
	int y = iObj.intValue();
	System.out.println(y);
	//String to Wrapper object
	String val = "1000";
	Integer iObj4 = new Integer(val);
	System.out.println(iObj4);
	Integer iObj5 = Integer.valueOf(val);
	System.out.println(iObj5);
	
	//Wrapper to String
	String val1 = iObj5.toString();
	System.out.println(val1);
	
	//primitive to String
	int intVal = 20;
	String s1 = ""+intVal;
	String s2 = String.valueOf(intVal);
	String s3 = Integer.toString(intVal);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	//String to primitive
	String s4 = "100";
	int result = Integer.parseInt(s4);
	System.out.println(result);
 	
	
}
}

