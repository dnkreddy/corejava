//Demo on inheritence with super
class Lab248{
public static void main(String args[]){	
	//A a = new A();
	B b = new B(10);
	b.print();
}
}
class A{
	int a = 20;
  A(){
	  System.out.println("A default const");
  }
  A(int a){
	  System.out.println("A one arg const");
  }
}
class B extends A{
	int a = 30;
	B(){
		System.out.println("B default const");
	}
	B(int b){
		System.out.println("B one arg const");
	}
	void print(){
		int a = 40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
