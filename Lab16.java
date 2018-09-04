class Lab16{
public static void main(String args[]){
	System.out.println("Main method starts");
   	Print p = new Print();
	MyThread t1 = new MyThread(p,"Thread1");
	MyThread t2 = new MyThread(p,"Thread2");
	t1.start();
	t2.start();
	System.out.println("Main method ends");
}
}

class MyThread extends Thread{
	Print print;
	 MyThread(){
	 }
	MyThread(Print p,String name){
		super(name);
		this.print = p;
	}
	public void run(){
		print.printNum();
	}
}
class Print{
	public void printNum(){
		 synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+"::"+i);
			}
		 }
	}
}