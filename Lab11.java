class Lab11{
public static void main(String args[]){
	
  MyThread t1 = new MyThread();
   //t1.start();  
   t1.run("Naveen");
	
	
}
}

class MyThread extends Thread{

   public void run(){
	   System.out.println("Run method with zero args");
      for(int i =0;i<10;i++){
	    System.out.println(i);
	  }
   }
   
   public void run(String name){
      for(int i =0;i<10;i++){
	    System.out.println(i);
	  }
   }

}