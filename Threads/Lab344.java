//Demo on Threadgroup and priority start method
class Lab344{
public static void main(String args[]){
	System.out.println("Main method start::"+Thread.currentThread().getName());
	Job1 job = new Job1();
	ThreadGroup tg = new ThreadGroup("LaviTg");
	Thread t1 = new Thread(tg,job);
	t1.setName("Lavi1");
	t1.setPriority(1);
	t1.start();
	Thread t2 = new Thread(tg,job);
	t2.setName("Lavi2");
	t2.setPriority(8);
	t2.start();
	System.out.println("Main Thread executing");
	for(int i=0;i<10;i++){
		System.out.println("Main Thread Priority::"+i+"::"+
		Thread.currentThread().getPriority());
	}
	System.out.println("Main method end");
}
}

class Job1 implements Runnable{
	
	public void run(){
		// task for this thread
	for(int i=0;i<10;i++){
		System.out.println("Job1 Priority::"+i+"::"+
		Thread.currentThread().getName());
	}		
	}
}