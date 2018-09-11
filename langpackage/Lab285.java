//Demo on Object().getClass() method
class Lab285{
public static void main(String args[]){
	A a = new A();
	Class c = a.getClass();
	System.out.println("Class Name::"+c.getName());
	Class scls = c.getSuperclass();
	System.out.println("SuperClass::"+scls.getName());
	System.out.println("==================");
	B b = new B();
	Class cls = b.getClass();
	System.out.println("Class Name::"+cls.getName());
	Class scls1 = cls.getSuperclass();
	System.out.println("SuperClass::"+scls1.getName());
}
}
class A{}
class B extends A{}