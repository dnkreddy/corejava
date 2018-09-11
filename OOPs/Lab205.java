//Demo on static methods
class Lab205{
public static void main(String args[]){
	Addition a1= new Addition();
	a1.add(10,"20");
	byte b1 = 30;
	a1.add("10",20,b1);
}
}
class Addition{
	String result;
	static void add(int a,String b){
		result = a+b;
		System.out.println(result);
	}
	
	static void add(String a,int b,byte c){
		result = a+b+c;
		System.out.println(result);
	}
}