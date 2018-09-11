//Demo on call by reference
class Lab216{
public static void main(String args[]){
	Hello h = new Hello();
	h.a = 10;
	h.b = 20;
	System.out.println("h addrss in main::"+h);
		
	SayHello cal = new SayHello();
	cal.sayHello(h);
	System.out.println("main:::"+h.a);
	System.out.println("main:::"+h.b);
	
}
}
 class SayHello{
	 
	 void sayHello(Hello h){
		 System.out.println("h address::"+h);
		 System.out.println("Before change::"+h.a);
		 System.out.println("Before change::"+h.b);
		 h.a = 100;
		 h.b = 200;
		 System.out.println("After change::"+h.a);
		 System.out.println("After change::"+h.b);
		 
	 }
	 
 }
	 
class Hello{
	int a;
	int b;
}