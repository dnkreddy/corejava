//Demo on constructors
class Lab192{
public static void main(String args[]){
	float f = 100.01f;
  Hello h1 = new Hello(f);
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