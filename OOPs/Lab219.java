//Demo on Method overloading
class Lab219{
public static void main(String args[]){
	Addition a = new Addition();
	byte b = 30;
	int res = a.add(b);
	System.out.println("Result:"+res);
}
}

class Addition{
	
	int add(int a){
		System.out.println("int one argument add method");
		return a;
	}
	
	int add(byte a){
		System.out.println("byte one argument add method");
		return a; 
	}
	
	int add(long a){
		System.out.println("long one argument add method");
		return (int)a;
	}
	
	
}
