//Demo on exceptions inner try catch
class Lab323{
public static void main(String args[]){
  System.out.println("Main method start");
  try{
    int x = 0;
	String arg1 = null;
	  try{ 
	   arg1 = args[0];
	  }catch(ArrayIndexOutOfBoundsException ex1){
		  System.out.println("In AIOBException catch block");
	  }
	 System.out.println("Value input:"+arg1);
	  try{
	   x= Integer.parseInt(arg1);
	  }catch(Exception ex2){
		  System.out.println("In NFE catch block");
	  }
	  System.out.println("Int value::"+x);
	  int y = 10/x;
	  System.out.println("result value::"+y);
      
  }catch(Exception ex){
	    System.out.println(ex.getMessage());
		ex.printStackTrace();
		 try{
			 int y = 40/0;
		 }catch(ArithmeticException ex3){
			 System.out.println("Nested try catch in catch block");
		 }
  }finally{
	  System.out.println("code for clean up activities");
	  //code to close the connection
  }
  System.out.println("Main method end");	
}
}