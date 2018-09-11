//Demo on CompoundAssignment operators
class Lab61{
public static void main(String args[]){
	  int a = 10;
	   a += 30;  // a = a+30;
	   System.out.println(a); 
	   byte b1 = 40;
	   b1 = (byte)b1+20;//compile time error
	   System.out.println(b1);
}
}