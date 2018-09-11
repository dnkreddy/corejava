//Demo on check exception for 
//method overriding
class Lab331{
public static void main(String args[])throws Exception{
	A a = new B();
	a.show();
}
}

class A{
	  void show()throws ClassNotFoundException{
		System.out.println("A-->show()");
	}
}
class B extends A{
	  void show(){
		System.out.println("B-->show()");
	}
}