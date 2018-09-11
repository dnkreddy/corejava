//Demo on abstract 
import java.io.*;
class Lab273{
public static void main(String args[])throws Exception{
	 Shape s1 = new Square();
	 s1.draw();
	 s1.measurements();
}
}

abstract class Shape{
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



