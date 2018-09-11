//Demo on constructors
class Lab188{
public static void main(String args[]){
  Hello h = new Hello(100);
  System.out.println(h.age);
  Hello h1 = new Hello(200,9090909);
  System.out.println(h1.age); 
  System.out.println(h1.phoneNo); 
}
}
class Hello{
	int age;
	static long phoneNo;
	
	Hello(){
    System.out.println("Zero arg constructor");	
	}
	
	Hello(int a){
	age = a;
    System.out.println("1 arg constructor");	
	}
	
	Hello(int age,long phoneNo){
	this.age = age;
	this.phoneNo = phoneNo;
    System.out.println("2 arg constructor");	
	}
	
}