//Demo on Method overloading
class Lab217{
public static void main(String args[]){
	Addition a = new Addition();
	int res = a.add(10,20);
	System.out.println("Result:"+res);
}
}

class Addition{
	
	int add(int a){
		System.out.println("one argument add method");
		return a;
	}
	
	int add(int a,int b){
		System.out.println("two argument add method");
		return a+b; 
	}
	
	int add(int a,int b,int c){
		System.out.println("three argument add method");
		return a+b+c;
	}
	
	
}
