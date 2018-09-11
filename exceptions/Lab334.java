//Demo on check exception for 
//method overriding
import java.io.*;
class Lab334{
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
	  void show()throws FileNotFoundException,ClassNotFoundException{
		System.out.println("B-->show()");
	}
}