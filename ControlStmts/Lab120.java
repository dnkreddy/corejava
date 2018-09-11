//Demo on conitue
class Lab120{
public static void main(String args[]){
System.out.println("Main method start");
  LAVI:for(int i = 0;i<10;i++){
	  if(i == 3){
		continue LAVI;
	  }
	  System.out.println("i value::"+i);
  }
 System.out.println("Main method end");
}
}