//Demo on inheritence with constructors
class Lab245{
public static void main(String args[]){	
	//A a = new A();
	B b = new B(10,20);
}
}
class A{
  A(){
	  System.out.println("A default const");
  }
  A(int a){
	  System.out.println("A one arg const");
  }
  A(int a,int b){
	  System.out.println("A two arg const");
  }
}
class B extends A{
	B(){
		System.out.println("B default const");
	}
	B(int b){
		System.out.println("B one arg const");
	}
	B(int a,int b){
		System.out.println("B two arg const");
	}
}
