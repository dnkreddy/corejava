//Demo on static block
class Lab161{
public static void main(String args[]){
  System.out.println(Hello.age);
}
}
class Hello{
	 static int age;
 static{
	
	  System.out.println("static block");
	 }
}