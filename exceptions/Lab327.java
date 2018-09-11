//Demo on catch with multiple exceptions
import java.io.*;
class Lab327{
public static void main(String args[]){
	System.out.println("Main method start");
  try{
  String arg1 = args[0];
  System.out.println("Value input:"+arg1);
  int x = Integer.parseInt(arg1);
  System.out.println("Int value::"+x);
  int y = 10/x;
  System.out.println("result value::"+y);
  }catch(ArrayIndexOutOfBoundsException |
			NumberFormatException |
				ArithmeticException ex1){
	System.out.println("Iam in catch block");
	  System.out.println(ex1.getMessage());
	  ex1.printStackTrace();
  }  
  catch(Exception ex){
	    System.out.println(ex.getMessage());
		ex.printStackTrace();
  }
}
}