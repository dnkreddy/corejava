//Demo on instance methods
class Lab207{
public static void main(String args[]){
	Addition a1= new Addition();
	a1.add(10,"20");
	byte b1 = 30;
	a1.add("10",20,b1);
}
}
class Addition{
	 String result;
	 void add(int a,String b){
		result = a+b;
		System.out.println(result);
		this.sayHello();
	 }
	 void add(String a,int b,byte c){
		result = a+b+c;
		System.out.println(result);
	 }
	void sayHello(){
		System.out.println("Iam in addition class");
	}
	
}