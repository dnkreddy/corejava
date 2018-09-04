class Lab14{
public static void main(String args[])throws Exception{
	System.out.println("Maint method starts");
	Job job = new Job();
	Thread t1 = new Thread(job);
	t1.start();
	//t1.join();
	for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
	}
    System.out.println("Main method ends");
}
}

class Job implements Runnable{
	public void run(){
		Thread.yield();//
		System.out.println("In Runnable-> run() start::"+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}


