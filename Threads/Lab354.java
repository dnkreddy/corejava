//Demo on wait and notify methods
class Lab354{
public static void main(String args[]){
 System.out.println("main method start ::"+Thread.currentThread().getName());
 MyThread t1 = new MyThread("Count Thread");	
	t1.start();
  synchronized(t1){	
  System.out.println("main thread in synchronized block");
  try{
  t1.wait();
  }catch(Exception ex){
	  ex.printStackTrace();
  }
  System.out.println("count value::"+Thread.currentThread().getName()+"::"+t1.count);	
  System.out.println("Main method end");
  }  
}
}
class MyThread extends Thread{
		int count;
		MyThread(String name){
			super(name);
		}
	public void run(){
		System.out.println("Child Thread ::"+Thread.currentThread().getName());
		synchronized(this){
		for(int i=0;i<5;i++){
			count = count+i;
		}
        System.out.println("count completed and notify::"+count);
		notify();
		}		
	}	
}