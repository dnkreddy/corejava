//Demo on static variables
class Lab152{
public static void main(String args[]){
	System.out.println("age::"+Hello.age);
	System.out.println("name::"+Hello.name);
}
}
class Hello{
	static int age;
	static String name;
}