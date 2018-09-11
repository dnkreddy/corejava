//Demo on constructors
class Lab185{
public static void main(String args[]){
  Hello h = new Hello();
  System.out.println(h.age);
  Hello h1 = new Hello(100);
 System.out.println(h1.age);  
}
}
class Hello{
	int age;
	{
		age = 50;
		System.out.println("instance block");
	}
	
	Hello(){
    System.out.println("Zero arg constructor");	
	}
	
	Hello(int a){
	age = a;
    System.out.println("1 arg constructor");	
	}
	
}