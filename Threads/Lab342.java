//Demo on Thread name
class Lab342{
public static void main(String args[]){
	System.out.println("Main method start::"+Thread.currentThread().getName());
	Job1 job = new Job1();
	Thread t1 = new Thread(job);
	t1.setName("Lavi1");
	t1.start();
	Thread t2 = new Thread(job);
	t2.setName("Lavi2");
	t2.start();
	System.out.println("Main method end");
	for(int i=0;i<10;i++){
		System.out.println("Main Thread::"+i+"::"+Thread.currentThread().getName());
	}
}
}

class Job1 implements Runnable{
	
	public void run(){
		// task for this thread
	for(int i=0;i<10;i++){
		System.out.println("MyThread::"+i+"::"+Thread.currentThread().getName());
	}		
	}
}