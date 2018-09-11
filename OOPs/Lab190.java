//Demo on constructors
class Lab190{
public static void main(String args[]){
  byte b = 20;
  Hello h1 =new Hello(b);
  long l = 300l;
  Hello h2 = new Hello(l);
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