//Demo on Thread join method
class Lab347{
public static void main(String args[])throws Exception{
	System.out.println("Main method start::"+Thread.currentThread().getName());
	Job1 job = new Job1();
	Thread t1 = new Thread(job);
	t1.start();
	t1.join();
	System.out.println("Main Thread executing");
	for(int i=0;i<10;i++){
		System.out.println("main Method thread::"+i);
	}
	System.out.println("Main method end");
}
}
class Job1 implements Runnable{
	public void run(){
		//task for this thread
	for(int i=0;i<10;i++){
		System.out.println("Child thread::"+i);
	}		
	}
}