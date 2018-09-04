class Lab10{
public static void main(String args[]){
 System.out.println("Lab10::main method starts ");
  int age = 10;
  System.out.println("age::"+age);
   System.out.println("Tgroup:"+Thread.currentThread().getThreadGroup());
   
	MyThread  th1 = new MyThread("MyThread");
	//th1.setName();
	th1.start(); 
	//th1.start(); 
	for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"::"+i);
		}
 System.out.println("Lab10::main method ends ");
}
}
class MyThread extends Thread{
	
	MyThread(){
		
	}
	MyThread(String name){
		super(name);
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"::"+i);
		}
		
	}	
}

