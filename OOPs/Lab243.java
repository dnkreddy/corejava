//Demo on inheritence with constructors
class Lab243{
public static void main(String args[]){	
	//A a = new A();
	B b = new B(10);
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
	B(int a){
		System.out.println("B one arg const");
	}
}
