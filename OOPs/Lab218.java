//Demo on Method overloading
class Lab218{
public static void main(String args[]){
	Addition a = new Addition();
	byte b = 30;
	int res = a.add(b,20);
	System.out.println("Result:"+res);
}
}

class Addition{
	
	int add(int a){
		System.out.println("one argument add method");
		return a;
	}
	
	int add(byte a,int b){
		System.out.println("two argument add method");
		return a+b; 
	}
	
	int add(int a,byte b){
		System.out.println("two argument add method");
		return a+b;
	}
	
	
}
