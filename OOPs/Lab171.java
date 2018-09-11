//Demo on local variable
class Lab171{
	
public static void main(String args[]){
	Hello h = new Hello();
	h.print();
}
}

class Hello{
	int age = 40;
	long phoneNo;
	void print(){
		int age = 30;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(phoneNo);
	}
}