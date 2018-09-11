//Demo on static block
class Lab160{
public static void main(String args[]){
 Hello h = null;
 System.out.println(h.age);
}
}
class Hello{
	 static int age;
 static{
	
	  System.out.println("static block");
	 }
}