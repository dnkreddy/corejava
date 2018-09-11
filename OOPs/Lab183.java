//Demo on constructors
class Lab183{
public static void main(String args[]){
  Hello h = new Hello();		
}
}
class Hello{
	static{
		System.out.println("Staic block");
	}
	{
		System.out.println("instance block");
	}
	
	Hello(){
    System.out.println("Zero arg constructor");	
	}
	
}