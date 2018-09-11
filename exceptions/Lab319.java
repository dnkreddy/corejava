//Demo on exceptions
class Lab319{
public static void main(String args[]){
  System.out.println("Main method start");
  try{
  String arg1 = args[0];
  System.out.println("Value input:"+arg1);
  int x = Integer.parseInt(arg1);
  System.out.println("Int value::"+x);
  int y = 10/x;
  System.out.println("result value::"+y);
  //parent Exception catch
  }catch(Exception ex){
	    System.out.println(ex.getMessage());
		ex.printStackTrace();
  }catch(ArrayIndexOutOfBoundsException ex1){
	  System.out.println(ex1.getMessage());
	  ex1.printStackTrace();
  }  
  catch(NumberFormatException ex2){
	    System.out.println(ex2.getMessage());
		ex2.printStackTrace();
  }catch(ArithmeticException ex3){
	    System.out.println(ex3.getMessage());
		ex3.printStackTrace();
  }
  System.out.println("Main method end");	
}
}