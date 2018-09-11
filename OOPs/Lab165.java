//Demo on static block
class Lab165{
public static void main(String args[]){
	Hello h = new Hello();
  System.out.println(Hello.name);
}
}
class Hello{
	 int age;
	 static String name;
     static{
	  //age = 20;
	  name = "LAVI";
	  System.out.println("static block1");
	 }
	 
	  static{
	  System.out.println("static block2");
	 }
}