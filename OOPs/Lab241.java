//Demo on inheritence with blocks
class Lab241{
public static void main(String args[]){	
	//A a = new A();
	B b = new B();
}
}
class A{
	static int a;
	static {
		a = 20;
		System.out.println("A class SIB");
	}
}
class B extends A{
	static int b;
	static{
		//a = 40;
		b = 50;
		System.out.println("B class SIB"+a+"::"+b);
	}
}
