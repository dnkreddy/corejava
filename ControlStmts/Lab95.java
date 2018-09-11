//Demo on switch Control stmt
class Lab95{
public static void main(String args[]){ 
System.out.println("Start of main method");

  int a = 10;
  int b  =20;
  
  switch(a+b){
	  //compile time error
	  case a:
	  System.out.println("Value is 10");
	  break;
	  case b:
	  System.out.println("Value is 20");
	  break;
	  case 30:
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