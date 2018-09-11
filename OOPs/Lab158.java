//Demo on instance block
class Lab158{
public static void main(String args[]){
	Hello h = new Hello();
	System.out.println(h.a);
}
}
class Hello{
	 int a;
	 {
	  a = 30;
	  System.out.println("Instance block");
	 }
}