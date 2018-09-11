//Demo on static block
class Lab164{
public static void main(String args[]){
	Hello h = new Hello();
  System.out.println(Hello.name);
}
}
class Hello{
	 int age;
	 static String name;
     static{
	  age = 20;
	  name = "LAVI";
	  System.out.println("instance block");
	 }
}