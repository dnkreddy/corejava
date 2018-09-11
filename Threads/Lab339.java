//Demo on Threads start method
class Lab339{
public static void main(String args[]){
	System.out.println("Main method start::"+Thread.currentThread().getName());
	MyThread t1 = new MyThread("LaviThread");
	//t1.setName("LAVI");
	t1.start();
	System.out.println("Main method end");
	for(int i=0;i<10;i++){
		System.out.println("Main Thread::"+i+"::"+Thread.currentThread().getName());
	}
}
}
class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run(){
		// task for this thread
	for(int i=0;i<10;i++){
		System.out.println("MyThread::"+i+"::"+Thread.currentThread().getName());
	}		
	}
}