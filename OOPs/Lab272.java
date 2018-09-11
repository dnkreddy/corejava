//Demo on Polymorphism dynamic
import java.io.*;
class Lab272{
public static void main(String args[])throws Exception{
	
       String shape = args[0];
	   Draw d = new Draw();
	   Shape s = null;
       if(shape.equals("square")){
		   s = new Square();
	   }else if(shape.equals("triangle")){
		   s = new Triangle();
	   }else{
		   s = new Shape();
	   }
     d.drawShape(s);	   
}
}

class Shape{
	void draw(){
		System.out.println("shape draw() method");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("Square draw() method");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("Triangle draw() method");
	}
}


class Draw{
	void drawShape(Shape s){
		s.draw();
	}	
}