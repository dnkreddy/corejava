//Demo on Enum
public class Lab410{
public static void main(String args[]){
	System.out.println(Direction.EAST);
	
	if(Direction.EAST.name() == "EAST"){
		System.out.println("Iam in East directin");
	}
	System.out.println(Direction.EAST.ordinal());
	System.out.println(Direction.SOUTH.ordinal());
	
	Direction dir[] = Direction.values();
	
	for(Direction d:dir){
		System.out.println("Direction::"+d.name());
	}
	
}
}

enum Direction{
	EAST(0),
	WEST(180),
	NOTRTH(90),
	SOUTH(270);
	
	Direction(){
		System.out.println("zero argument construtctor");
	}
	
	Direction(int deg){
		System.out.println("one argument construtctor::"+deg);
	}
}