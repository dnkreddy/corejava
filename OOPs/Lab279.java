//Demo on interface
class Lab279{
public static void main(String args[])throws Exception{
  Inter1 i1 = new InterImpl();
  i1.m1();
  InterImpl impl = new InterImpl();
  impl.m1();
  impl.sayHello();
}
}
interface Inter1{
	Inter1(){}
	public void m1();
}
class Hello{
	void sayHello(){
		System.out.println("Hellooo");
	}
}
class InterImpl extends Hello implements Inter1{
  public void m1(){
		System.out.println("m1 method impl");	
	}
  public void m2(){
		System.out.println("m2 method impl");
	}
}