//Demo on switch Control stmt
class Lab96{
public static void main(String args[]){ 
System.out.println("Start of main method");

  final int a = 10;
  final int b  =20;
  
  switch(a+b){
	  //final variables as case labels
	  case a:
	  System.out.println("Value is 10");
	  break;
	  case b:
	  System.out.println("Value is 20");
	  break;
	  case a+b:
	  System.out.println("Value is 30");
	  break;
	  case 40:
	  System.out.println("Value is 40");
	  break;
	  default:
	  System.out.println("In Default");
	  
  }
}
  
}