class Lab12{
public static void main(String args[]){
	
	System.out.println(Thread.currentThread().getName());
	
	Job job = new Job();
	Thread t1 = new Thread(job,"Thread1");
	//t1.setName("NaveenThread");
	t1.start();
	
	
	Thread t2 = new Thread(job,"Thread2");
	//t1.setName("NaveenThread");
	t2.start();
	
}
}
class Job implements Runnable{
	public void run(){
		System.out.println("In Runnable-> run() start::"+Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
}


