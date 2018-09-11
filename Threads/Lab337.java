//Demo on Threads
class Lab337{
public static void main(String args[]){
	System.out.println("Main method start");
	MyThread t1 = new MyThread();
	//t1.run();
	t1.start();
	System.out.println("Main method end");
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