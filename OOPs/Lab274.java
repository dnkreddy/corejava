//Demo on abstract
import java.io.*;
class Lab274{
public static void main(String args[])throws Exception{
	 
	 Shape s1 = new Square();
	 s1.draw();
	 s1.measurements();
	 
}
}

abstract class Shape{
	int i = 10;
	Shape(){
		System.out.println("Super Shape constructor");
	}
	void draw(){
		System.out.println("shape draw() method");
	}
	abstract void measurements();
}
 class Square extends Shape{
	 
	 void measurements(){
		 System.out.println("Square mesurements");
	 }
	
}



