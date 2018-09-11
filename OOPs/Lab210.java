//Demo on return type
class Lab210{
public static void main(String args[]){
	Addition a1= new Addition();
	a1.add(10,20);
	
}
}
class Addition{
	 int result;
	 int add(int a,int b){
		result = a+b;
		return result;	
	 }	
}