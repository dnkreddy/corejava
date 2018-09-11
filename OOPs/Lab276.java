//Demo on abstract
class Lab276{
public static void main(String args[])throws Exception{

	 Bank b = new BglrHdfcBank();
	 b.transferFunds();
	 b.balanceEnquiry();
}
}

interface Bank{
	int x = 10;
	//public static final int x = 10;
	void transferFunds();
	//public abstract void transferFunds();
	void balanceEnquiry();
}

abstract class HDFCBank implements Bank{
	
	public void transferFunds(){
		System.out.println("HDFC bank transferFunds");
	}
}

class BglrHdfcBank extends HDFCBank{
	public balanceEnquiry(){
		System.out.println("BglrHdfcBank balanceEnquiry");
	}
	
}