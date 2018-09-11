//Demo on Method overloading
class Lab220{
public static void main(String args[]){
	Addition a = new Addition();
	byte b = 30;
	a.add(b);
}
}

class Addition{
	
	void add(int a){
		System.out.println("int one argument add method");
		
	}
	
	void add(byte a){
		System.out.println("byte one argument add method");
		return;
    // System.out.println("After return");		
	}
	
	void add(long a){
		System.out.println("long one argument add method");
		
	}
	
	
}
