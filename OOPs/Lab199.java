//Demo on instance methods
class Lab199{
public static void main(String args[]){
	Switch s = null;
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