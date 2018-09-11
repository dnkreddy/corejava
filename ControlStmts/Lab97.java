//Demo on switch Control stmt
class Lab97{
public static void main(String args[]){ 
System.out.println("Start of main method");
  byte b = 20;
  switch(b){
      //incompatible types
	  case 100:
	  System.out.println("Value is 10");
	  break;
	  case 110:
	  System.out.println("Value is 20");
	  break;
	  case 115:
	  System.out.println("Value is 30");
	  break;
	  case 130:
	  System.out.println("Value is 40");
	  break;
	  default:
	  System.out.println("In Default");
	  
  }
}
  
}