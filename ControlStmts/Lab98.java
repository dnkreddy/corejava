//Demo on switch Control stmt
class Lab98{
public static void main(String args[]){ 
System.out.println("Start of main method");
  char c = 'A';
  switch(c){
      //duplicate case labels
	  case 'A':
	  System.out.println("Value is 10");
	  break;
	  case 65:
	  System.out.println("Value is 20");
	  break;
	  case 66:
	  System.out.println("Value is 30");
	  break;
	  case 'B':
	  System.out.println("Value is 40");
	  break;
	  default:
	  System.out.println("In Default");
	  
  }
}
  
}