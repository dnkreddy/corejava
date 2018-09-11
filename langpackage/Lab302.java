//Demo on String class
class Lab302{
public static void main(String args[]){
	String s1 = "This is Lavi,Lavi located in Marathahalli";
	String s2 = "This is LaVi";
	String s3 = "";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	//equal check
	if(s1.equals(s2)){
		System.out.println("both objects are equal");
	}else{
		System.out.println("both objects are not equal");
	}
	
	//equalsIgnoreCase check
	if(s1.equalsIgnoreCase(s2)){
		System.out.println("both objects are equal");
	}else{
		System.out.println("both objects are not equal");
	}
    System.out.println(s1.length());
	System.out.println(s1.isEmpty());
	System.out.println(s3.isEmpty());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.charAt(0));
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3,7));
	System.out.println(s1.indexOf("Lavi"));
	System.out.println(s1.lastIndexOf("Lavi"));
	String[] sts = s1.split("located");
	for(String s:sts){
		System.out.println(s);
	}
	String regex = ".*[A-Za-z]";
	System.out.println(s1.matches(regex));
	System.out.println(s1.startsWith("This"));
	System.out.println(s1.endsWith("Marathahalli"));
	String s4 = "      This is lavi   ";
	System.out.println(s4.trim());
	System.out.println(String.valueOf(123));
	System.out.println(s1.compareTo(s2));
}
}