//Demo on Thread yield method
class Lab346{
public static void main(String args[]){
	System.out.println("Main method start::"+Thread.currentThread().getName());
	Job1 job = new Job1();
	Thread t1 = new Thread(job);
	t1.start();
	System.out.println("Main Thread executing");
	for(int i=0;i<10;i++){
		System.out.println("main Method thread::"+i);
	}
	System.out.println("Main method end");
}
}

class Job1 implements Runnable{
	public void run(){
	Thread.currentThread().yield();
		//task for this thread
	for(int i=0;i<10;i++){
		System.out.println("Child thread::"+i);
	}		
	}
}