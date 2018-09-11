//Demo on switch Control stmt
class Lab101{
public static void main(String args[]){ 
System.out.println("Start of main method");
 String s = "NORTH";
  //added in java1.7 String for switch
  switch(s){
      case "EAST":
	  System.out.println("Value is EAST");
	  break;
	  case "WEST":
	  System.out.println("Value is WEST");
	  break;
	  case "NORTH":
	  System.out.println("Value is NORTH");
	  break;
	  case "SOUTH":
	  System.out.println("Value is SOUTH");
	  break;
	  default:
	  System.out.println("In Default");
	  
  }
}
  
}

