//Demo on Thread sleep method
class Lab345{
public static void main(String args[]){
	System.out.println("Main method start::"+Thread.currentThread().getName());
	
	Job1 job = new Job1();
	Thread t1 = new Thread(job);
	t1.start();
	System.out.println("Main Thread executing");
	for(int i=0;i<10;i++){
		try{
		Thread.currentThread().sleep(1000);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("main Method thread::"+i);
	}
	System.out.println("Main method end");
}
}

class Job1 implements Runnable{
	public void run(){
		//task for this thread
	for(int i=0;i<10;i++){
		try{
			//sleep overloaded method
		Thread.currentThread().sleep(1000,200);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("Child thread::"+i);
	}		
	}
}