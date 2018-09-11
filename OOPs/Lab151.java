//Demo on instance variables
class Lab151{
public static void main(String args[]){
	Hello h = null;
	System.out.println("age::"+h.age);
	System.out.println("name::"+h.name);
}
}

class Hello{
	int age;
	static String name;
}