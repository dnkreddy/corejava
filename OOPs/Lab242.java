//Demo on inheritence with constructors
class Lab242{
public static void main(String args[]){	
	//A a = new A();
	B b = new B();
}
}
class A{
  A(){
	  System.out.println("A default const");
  }
}
class B extends A{
	B(){
		System.out.println("B default const");
	}
}
