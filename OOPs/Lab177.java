//Demo on constructors
class Lab177{
public static void main(String args[]){
	
  Hello h = new Hello();	
	
}
}
class Hello{
	Hello(){
    System.out.println("Zero arg constructor");	
	}
	
	Hello(int a){
    System.out.println("1 arg constructor");	
	}
}