//Demo on call by value
class Lab215{
public static void main(String args[]){
	
	int a = 30;
	int b = 40;
	CallByValRef cal = new CallByValRef();
	cal.print(a,b);
	System.out.println("main:::"+a);
	System.out.println("main:::"+b);
	
}
}
 class CallByValRef{
	 void print(int a,int b){
		 System.out.println("Print:Before::"+a);
		 System.out.println("Print:Before::"+b);
		 a = 100;
		 b = 200;
		  System.out.println("Print:After change::"+a);
		 System.out.println("Print:After change::"+b);
	 }
	 
 }
	 
