//Demo on inheritence with blocks
class Lab240{
public static void main(String args[]){	
	//A a = new A();
	B b = new B();
}
}
class A{
	int a;
	{
		a = 20;
		System.out.println("A class IIB");
	}
}
class B extends A{
	int b;
	{
		//a = 40;
		b = 50;
		System.out.println("B class IIB"+a+"::"+b);
	}
}
