class Lab355{
public static void main(String args[]){
	Calculator cal = new Calculator();
	ConsumerThread consumer1 = new ConsumerThread(cal,"Con1");
	ConsumerThread consumer2 = new ConsumerThread(cal,"Con2");
	consumer1.start();
	consumer2.start();
	ProducerThread p1 = new ProducerThread(cal,"Prod1");
	p1.start();
}
}
class ConsumerThread extends Thread{
	Calculator  cal;
	ConsumerThread(Calculator calucaltor,String name){
		super(name);
		this.cal = calucaltor;
	}
	public void run(){
		synchronized(cal){
		try{
		System.out.println("child Thread going to wait state::"+Thread.currentThread().getName());
		cal.wait();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("child Thread::"+Thread.currentThread().getName());
		System.out.println("Count value::"+cal.count);
		}
	}
}

class ProducerThread extends Thread{
	Calculator  cal;
	ProducerThread(Calculator calucaltor,String name){
		super(name);
		this.cal = calucaltor;
	}
	public void run(){
		System.out.println("Producer Thread::"+Thread.currentThread().getName());
		synchronized(cal){
		int sum = 0;
		for(int i =0;i<10;i++){
			sum = sum+i;
		}
		cal.count = sum;
		System.out.println("count value generated and notifying::"+cal.count);
		cal.notifyAll();
		}
	}
}

class Calculator{
	int count;
}