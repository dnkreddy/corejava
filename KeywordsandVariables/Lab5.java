//variable declaration and intialization
class Lab5{
//<modifiers> <datatype> <varName>;
static int x;
static byte b;
static String name;

public static void main(String args[]){
	//intialization
	x = 10;
	b = 20;
	name = "Lavi";
	System.out.println(x);
	System.out.println(b);
	System.out.println(name);
	
	x = 50;
	b = 60;
	System.out.println("===========");
	System.out.println(x);
	System.out.println(b);
	System.out.println(name);
}
}