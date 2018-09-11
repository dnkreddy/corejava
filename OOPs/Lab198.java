//Demo on constructor  overloading
class Lab198{
public static void main(String args[]){
   Hello h1 =new Hello("10");
}
}
class Hello{
	Hello(String s){
		this(10,20);
		System.out.println("String constructor");
	}
	Hello(long l,int i){
		System.out.println("two constructor");
	}
}