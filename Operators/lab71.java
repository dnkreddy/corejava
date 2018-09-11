//Demo on Relational Operator
class Lab71{
public static void main(String args[]){
	//integer operands
     System.out.println(100== 100);
	 System.out.println(100!=100);
	//character operands
	System.out.println('A'!='B');
	System.out.println('A'=='A');
	//boolean operands
	System.out.println(true == false);
	System.out.println(true == true);
	//reference types
	Hello h1 = null;
	Hello h2 = null;
	System.out.println(h1 == h2);
	System.out.println(h1 != h2);
}
}
class Hello{}
