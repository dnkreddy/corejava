//Demo on Array
class Lab127{
	static int[] x;
public static void main(String args[]){
	//construction of array
	x = new int[5];
   System.out.println(x);
   System.out.println(x[0]);
   System.out.println(x[1]);
   System.out.println(x[2]);
   System.out.println(x[3]);
   System.out.println(x[4]);
   //intialize the values
   x[0] = 10;
   x[1] = 20;
   x[2]  = 30;
   
   System.out.println("===================");
   System.out.println(x[0]);
   System.out.println(x[1]);
   System.out.println(x[2]);
   System.out.println(x[3]);
   System.out.println(x[4]);
    
}
}