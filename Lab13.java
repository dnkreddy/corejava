class Lab13{
public static void main(String args[]){
	
	System.out.println("main Thread ::"+Thread.currentThread().getPriority());
	ThreadGroup tg1 = new ThreadGroup("PritinTG"); 
	Job job = new Job();
	Thread t1 = new Thread(tg1,job,"Thread1");
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.start();

}
}
class Job implements Runnable{
	public void run(){
		System.out.println("In Runnable-> run() start::"+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++){
			try{
			Thread.currentThread().sleep(2000,1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			System.out.println(i);
		}
	}
}


