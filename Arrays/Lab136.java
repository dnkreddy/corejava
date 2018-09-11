//Demo on two dimension Array
class Lab136{
	static int[] x2[];
public static void main(String args[]){
	x2 = new int[2][2];
	System.out.println(x2);
	System.out.println(x2[0]);
	System.out.println(x2[1]);
	System.out.println(x2[0][0]);
	System.out.println(x2[0][1]);
	System.out.println(x2[1][0]);
	System.out.println(x2[1][1]);
	
	x2[0][0] = 10;
	x2[1][0] = 20;
	
	System.out.println("======");
	System.out.println(x2[0][0]);
	System.out.println(x2[0][1]);
	System.out.println(x2[1][0]);
	System.out.println(x2[1][1]);
	
	
   
}
}