//Demo on Threads  
class Lab338{
public static void main(String args[]){
	System.out.println("Main method start::"+Thread.currentThread().getName());
	MyThread t1 = new MyThread();
	t1.run();
	System.out.println("Main method end");
	for(int i=0;i<10;i++){
		System.out.println("Main Thread::"+i+"::"+Thread.currentThread().getName());
	}
}
}


class MyThread extends Thread{
	public void run(){
		// task for this thread
	for(int i=0;i<10;i++){
		System.out.println("MyThread::"+i+"::"+Thread.currentThread().getName());
	}		
	}
}