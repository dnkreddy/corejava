//Demo on Thread isAlive and isDaemon 
class Lab348{
public static void main(String args[])throws Exception{
	System.out.println("Main method start::"+Thread.currentThread().isAlive());
	Job1 job = new Job1();
	Thread t1 = new Thread(job);
	t1.setDaemon(true);
	t1.start();
	//t1.setDaemon(true);
	System.out.println("Main Thread executing");
	for(int i=0;i<10;i++){
		System.out.println("main Method thread::"+i);
	}
	System.out.println("Main method end ::"+Thread.currentThread().isDaemon());
	System.out.println("Child Thread isAlive::"+t1.isAlive());
	System.out.println("Child Thread isDaemon::"+t1.isDaemon());
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