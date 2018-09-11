//Demo on constructor  overloading
class Lab196{
public static void main(String args[]){
  
   Hello h1 =new Hello("10");
   Hello h2 =new Hello(null);
  
}
}
class Hello{
	
	Hello(byte b,int i){
		System.out.println("two constructor");
	}
	
	Hello(int i,byte b){
		System.out.println("two constructor");
	}
	
	Hello(String s){
		System.out.println("String constructor");
	}
	
	Hello(Object l){
		System.out.println("object constructor");
	}
	
	
}