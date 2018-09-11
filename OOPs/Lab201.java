//Demo on static methods
class Lab201{
public static void main(String args[]){
	Switch s = null;
	s.switchOn();
	
	Switch.switchOff();
	
	Switch s1 = new Switch();
	s1.switchOn();
}
}

class Switch{
	
	String state;
	int price;
	
	static void switchOn(){
		System.out.println("Supply power");
	}
	static void switchOff(){
		System.out.println("Disconnect power");
	}
}