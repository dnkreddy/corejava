//Demo on instance methods
class Lab200{
public static void main(String args[]){
	Switch s = new Switch();
	s.switchOn();
}
}

class Switch{
	
	String state;
	int price;
	
	void switchOn(){
		System.out.println("Supply power");
	}
	void switchOff(){
		System.out.println("Disconnect power");
	}
}