//Demo on constructors
class Lab195{
public static void main(String args[]){
  
   Hello h1 =new Hello("10");
   Hello h2 =new Hello(null);
  
}
}
class Hello{
	
	Hello(byte b){
		System.out.println("byte constructor");
	}
	
	Hello(String s){
		System.out.println("String constructor");
	}
	
	Hello(Object l){
		System.out.println("object constructor");
	}
	
	
}