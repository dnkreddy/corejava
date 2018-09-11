//multiple variable declaration  in single line
class Lab7{
//<modifiers> <datatype> <varName> = <value>;
static int x,y,z;
static byte b = 2;
static String name = "Lavi";

public static void main(String args[]){
	x = 1;
	y = 2;
	z = 3;
	//Initial values
	System.out.println(x);
	System.out.println(b);
	System.out.println(name);
	System.out.println("===========");
	//Changing values of x and b
	x = 10;
	b = 20;
	name = "Lavi1";
	System.out.println(x);
	System.out.println(b);
	System.out.println(name);
	//Changing Values of x and b
	x = 50;
	b = 60;
	System.out.println("===========");
	System.out.println(x);
	System.out.println(b);
	System.out.println(name);
}
}