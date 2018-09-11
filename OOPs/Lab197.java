//Demo on constructor  overloading
class Lab197{
public static void main(String args[]){
   Hello h1 =new Hello("10");  
}
}
class Hello{
	
	Hello(String s){
		System.out.println("String constructor");
		this(10,20);
	}
		
	Hello(byte b,int i){
		System.out.println("two constructor");
	}
	
}