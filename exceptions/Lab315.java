//Demo on exceptions
class Lab315{
public static void main(String args[]){
  System.out.println("Main method start");
  String arg1 = args[0];
  System.out.println("Value input:"+arg1);
  int x = Integer.parseInt(arg1);
  System.out.println("Int value::"+x);
  int y = 10/x;
  System.out.println("result value::"+y);  
  System.out.println("Main method end");	
}
}