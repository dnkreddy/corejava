//Demo on synchronization of static method
class Lab352{
public static void main(String args[]){
System.out.println("main method start");
Account act = new Account();
WithDrawThread t1 =	new WithDrawThread(act,"Lavi1");
WithDrawThread t2 =	new WithDrawThread(act,"Lavi2");
t1.start();
t2.start();
System.out.println("Main method end");		
}
}
class WithDrawThread extends Thread{
	Account acct;
	WithDrawThread(Account account,String name){
		super(name);
		this.acct = account;	
	}
	public void run(){
		for(int i=0;i<=5;i++){
			acct.withdraw(250);
		}
		if(acct.getBal()<0){
			System.out.println("Amount is Overdrawn::"+acct.getBal());
		}
		
	}
	
}
class Account{
	static int bal = 1000;
	//public void withdraw(int amt){
	public static synchronized void withdraw(int amt){
		
		if(bal>=amt){
			System.out.println("Thread with Name "+
			Thread.currentThread().getName()+ "is withDrawing()");
			try{
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			bal = bal - amt;
			System.out.println(" Withdraw amount is done by Thread :"+
			Thread.currentThread().getName());
		}	
		
	}
	public int getBal(){
		return bal;
	}	
}





