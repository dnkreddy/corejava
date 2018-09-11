//Demo on constructors
class Lab180{
public static void main(String args[]){
  Hello h = new Hello("10");	
}
}
class Hello{
	Hello(){
    System.out.println("Zero arg constructor");	
	}
	
	Hello(int a){
    System.out.println("1 arg int constructor");	
	}
	
	Hello(String a){
    System.out.println("1 arg string constructor");	
	}
	
}