//Demo on constructors
class Lab194{
public static void main(String args[]){
  
   Hello h1 =new Hello(100);
   //Hello h2 =new Hello(100.01);
  
}
}
class Hello{
	
	Hello(byte b){
		System.out.println("byte constructor");
	}
	
	Hello(short s){
		System.out.println("short constructor");
	}
	
	Hello(long l){
		System.out.println("long constructor");
	}
	
	Hello(float f){
		System.out.println("float constructor");
	}
}