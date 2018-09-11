//Demo on instance methods
class Lab203{
public static void main(String args[]){
	Addition a1= new Addition();
	a1.add(10,20);
	byte b1 = 30;
	a1.add(10,20,b1);
}
}

class Addition{
	int result;
	void add(int a,int b){
		result = a+b;
		System.out.println(result);
	}
	
	void add(int a,int b,byte c){
		result = a+b+c;
		System.out.println(result);
	}
}