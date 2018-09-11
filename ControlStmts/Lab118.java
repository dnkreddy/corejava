//Demo on break
class Lab118{
public static void main(String args[]){
System.out.println("Main method start");
 
  LAVI:for(int i = 0;i<3;i++){
	 for(int j = 0;j<5;j++){
	  System.out.println("i and j value::"+i+"::"+j);
	  if(j==3){
		  break LAVI;
	  }
	  }
  }
 System.out.println("Main method end");
}
}