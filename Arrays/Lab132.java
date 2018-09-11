//Demo on Array
class Lab132{
	
public static void main(String args[]){
	String []x = {"Lavi1","Lavi2","Lavi3"};
   System.out.println(x);
   System.out.println(x[0]);
   System.out.println(x[1]);
   System.out.println(x[2]);

  
   //Array iteration
   for(int i=0;i<x.length;i++){
	   System.out.println("for loop::"+x[i]);
   }
   
   for(String v1:x){
	   System.out.println("foreach loop::"+v1);
   }
   
}
}