//Demo on static variables
class Lab153{
public static void main(String args[]){
	Hello h = null;
	System.out.println("age::"+h.age); 
	//h.age -> Hello.age
	System.out.println("name::"+h.name);
}
}
class Hello{
	static int age;
	static String name;
}