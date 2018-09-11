//Demo on check exception for 
//method overriding
import java.io.*;
class Lab333{
public static void main(String args[])throws Exception{
	A a = new B();
	a.show();
}
}

class A{
	  void show()throws IOException{
		System.out.println("A-->show()");
	}
}
class B extends A{
	  void show()throws FileNotFoundException,NullPointerException{
		System.out.println("B-->show()");
	}
}