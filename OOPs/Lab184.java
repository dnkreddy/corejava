//Demo on constructors
class Lab184{
public static void main(String args[]){
  Hello h = new Hello();
  System.out.println(h.age);
  Hello h1 = new Hello();
 System.out.println(h1.age);  
}
}
class Hello{
	int age;
	static{
		System.out.println("Static block");
	}
	{
		age = 50;
		System.out.println("instance block");
	}
	
	Hello(){
    System.out.println("Zero arg constructor");	
	}
	
}