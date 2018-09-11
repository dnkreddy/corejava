//Demo on constructors
class Lab189{
public static void main(String args[]){
  
  Hello h1 =new Hello(10);
}
}
class Hello{
	
	Hello(byte b){
		System.out.println("byte constructor");
	}
	
	Hello(short s){
		System.out.println("short constructor");
	}
	
	Hello(int i){
		System.out.println("int constructor");
	}
	Hello(long l){
		System.out.println("long constructor");
	}
	
}