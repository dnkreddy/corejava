//Demo on switch Control stmt
class Lab92{
public static void main(String args[]){ 
System.out.println("Start of main method");

  int a = 30;
  //fall through occurs here
  switch(a){
	  case 10:
	  System.out.println("Value is 10");
	  case 20:
	  System.out.println("Value is 20");
	  case 30:
	  System.out.println("Value is 30");
	  case 40:
	  System.out.println("Value is 40");
	  default:
	  System.out.println("In Default");
	  
  }
}
  
}