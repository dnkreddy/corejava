//Demo on Array
class Lab130{
	
public static void main(String args[]){
	String []x = new String[5];
   System.out.println(x);
   System.out.println(x[0]);
   System.out.println(x[1]);
   System.out.println(x[2]);
   System.out.println(x[3]);
   System.out.println(x[4]);
   //intialize the values
   x[0] = "Lavi1";
   x[1] = "Lavi2";
   x[2]  = "Lavi3";
   x[3] = "Lavi4";
   x[4] = "Lavi";
   //Array iteration
   for(int i=0;i<x.length;i++){
	   System.out.println("for loop::"+x[i]);
   }
   
   for(String v1:x){
	   System.out.println("foreach loop::"+v1);
   }
   
}
}