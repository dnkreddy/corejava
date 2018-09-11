//Demo on return type
class Lab209{
public static void main(String args[]){
	Addition a1= new Addition();
	a1.add(10,20);
	byte b1 = 30;
	a1.add(10,20,b1);
}
}
class Addition{
	 int result;
	 String add(int a,int b){
		result = a+b;
		return result;	
	 }
	 
	 void add(int a,int b,byte c){
		result = a+b+c;
		System.out.println(result);
	 }
	
}