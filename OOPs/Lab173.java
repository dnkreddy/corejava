//Demo on local variable
class Lab173{
	
public static void main(String args[]){
	Hello h1 = new Hello();
	System.out.println("h1 age::"+h1.age);
	System.out.println("h1 name::"+h1.name);
	System.out.println("h1 phoneNo::"+h1.phoneNo);
	System.out.println("=========");
	h1.age = 100;
	h1.name = "lavi";
	h1.phoneNo = 909090;
	System.out.println("h1 age::"+h1.age);
	System.out.println("h1 name::"+h1.name);
	System.out.println("h1 phoneNo::"+h1.phoneNo);
	System.out.println("=========");
	Hello h2 = new Hello();
	System.out.println("h2 age::"+h2.age);
	System.out.println("h2 name::"+h2.name);
	System.out.println("h2 phoneNo::"+h2.phoneNo);
	
}
}

class Hello{
	static int age = 20;
	String name;
	long phoneNo;
}