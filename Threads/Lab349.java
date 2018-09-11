//Demo on synchronization
class Lab349{
public static void main(String args[])throws Exception{
	System.out.println("Main method start::"+Thread.currentThread().isAlive());
	Print print = new Print();
	MyThread t1 = new MyThread(print,"Lavi1");
	t1.start();
	
	MyThread t2 = new MyThread(print,"Lavi2");
	t2.start();
	
	System.out.println("Main Thread end");
	
}
}
class MyThread extends Thread{
	Print print;
	MyThread(Print p,String name){
		super(name);
		this.print = p;
	}
	public void run(){
		print.show();
	}
}


class Print{
	synchronized void show(){
	//task for this thread
	for(int i=0;i<10;i++){
		System.out.println("Child Thread:"+
		Thread.currentThread().getName()+"::"+i);
	}		
	}
}