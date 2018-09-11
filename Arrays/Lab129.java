//Demo on Array
class Lab129{
	
public static void main(String args[]){
	int []x = new int[5];
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
   x[3] = 40;
   x[4] = 50;
   //Array iteration
   for(int i=0;i<x.length;i++){
	   System.out.println("for loop::"+x[i]);
   }
   
   for(int v1:x){
	   System.out.println("foreach loop::"+v1);
   }
   
}
}