//Demo on Method overloading
class Lab221{
public static void main(String args[]){
	Print p = new Print();
	p.print("LAVI");
}
}

class Print{
	
	void print(int a){
		System.out.println("int one argument add method");
		
	}
	void print(String a){
		System.out.println("String one argument add method");
		return;
   	}
	void print(long a){
		System.out.println("long one argument add method");
		
	}

}
