//Demo on instance methods
class Lab202{
public static void main(String args[]){
	Addition a1= new Addition();
	a1.add(10,20);
	a1.add(10,20,30);
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