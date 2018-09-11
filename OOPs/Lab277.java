//Demo on interface
class Lab277{
public static void main(String args[])throws Exception{
  Inter1 i1 = new InterImpl();
  i1.m1();
  //i1.m2();
  Inter2 i2 = new InterImpl();
  i2.m2();
  i2.m1();
  InterImpl impl = new InterImpl();
  impl.m1();
  impl.m2();
}
}

interface Inter1{
	public void m1();
}

interface Inter2{
	public void m2();
}

class InterImpl implements Inter1,Inter2{
  public void m1(){
		System.out.println("m1 method impl");	
	}
  public void m2(){
		System.out.println("m2 method impl");
	}
}