//Demo on exceptions
class Lab316{
public static void main(String args[]){
  System.out.println("Main method start");
  String arg1 = args[0];
  System.out.println("Value input:"+arg1);
  int x = Integer.parseInt(arg1);
  System.out.println("Main method x value::"+x);
  Demo d = new Demo();
  d.m1(x);
  System.out.println("Main method end");	
}
}

class Demo{
	
	void m1(int x){
		System.out.println("m1 method start::"+x);
		m2(x);
		System.out.println("m1 method end::"+x);
	}
	void m2(int y){
		System.out.println("m2 method start::"+y);
		m3(y);
		System.out.println("m2 method end::"+y);
		
	}
	void m3(int z){
		System.out.println("m3 method start::"+z);
		int res= 10/z;
		System.out.println("m3 method end::"+res); 
		
	}
}