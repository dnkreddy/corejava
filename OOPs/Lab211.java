//Demo on return type
class Lab211{
public static void main(String args[]){
	Addition a1= new Addition();
	//String res = a1.add(10,20);
	int res = a1.add(10,20);
	System.out.println("main method::"+res);
}
}
class Addition{
	 int result;
	 int add(int a,int b){
		result = a+b;
		return result;	
	 }	
}