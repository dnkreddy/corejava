//Demo on String class
class Lab300{
public static void main(String args[]){
	 String s1 = new String("Lavi");
	 String s2 = new String("Lavi");
	 
	 String s3 = s1.intern();
	 String s4 = "Lavi";
	  System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
     System.out.println(s4);
	 System.out.println("======hashcodes======");
     System.out.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	 System.out.println(s3.hashCode());
     System.out.println(s4.hashCode());

    if(s1 == s2){
		System.out.println("s1 and s2 are same objects");
	}else{
		System.out.println("s1 and s2 are not same objects");
	}
	
	if(s3 == s4){
		System.out.println("s3 and s4 are same objects");
	}else{
		System.out.println("s3 and s4 are not same objects");
	}
	
	if(s1 == s4){
		System.out.println("s1 and s4 are same objects");
	}else{
		System.out.println("s1 and s4 are not same objects");
	}
	
}
}