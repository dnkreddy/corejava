//Demo on constructors
class Lab191{
public static void main(String args[]){
  Hello h1 = new Hello(100.01);
}
}
class Hello{
	
	Hello(float f){
		System.out.println("float constructor");
	}
	
	Hello(double d){
		System.out.println("double constructor");
	}
	
	
}