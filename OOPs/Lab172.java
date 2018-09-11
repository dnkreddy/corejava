//Demo on local variable
class Lab172{
	
public static void main(String args[]){
	Hello h1 = new Hello();
	Hello h2 = new Hello();
	h2.print();
}
}

class Hello{
	int age = 40;
	long phoneNo;
	static String name;
	static short id;
	
	static{
		name = "LAVI";
		System.out.println("static block");
	}
	
	{
		id = 40;
		age = 100;
		System.out.println("instance block");
		{
			System.out.println("instance local block");
		}
	}
	
	void print(){
		int age = 60;
		System.out.println(age);
		System.out.println(this.age);
	}
	
}