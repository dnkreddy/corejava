//Demo on switch Control stmt
class Lab100{
public static void main(String args[]){ 
System.out.println("Start of main method");
  Direction d = Direction.SOUTH; 
  //added in java1.5 enums for switch
  switch(d){
      case EAST:
	  System.out.println("Value is EAST");
	  break;
	  case WEST:
	  System.out.println("Value is WEST");
	  break;
	  case NORTH:
	  System.out.println("Value is NORTH");
	  break;
	  case SOUTH:
	  System.out.println("Value is SOUTH");
	  break;
	  default:
	  System.out.println("In Default");
	  
  }
}
  
}

enum Direction{
	EAST,WEST,NORTH,SOUTH;
}