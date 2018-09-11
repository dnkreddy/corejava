//Demo on static variables
class Lab155{
public static void main(String args[]){
	Hello h = new Hello();
	System.out.println("age::"+h.age); 
	//h.age -> Hello.age
	System.out.println("name::"+h.name);
	
}
}
class Hello{
	static int age;
	static String name;
	long phoneNo;
	String address;
}