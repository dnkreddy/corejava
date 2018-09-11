//Demo on abstract
import java.io.*;
class Lab275{
public static void main(String args[])throws Exception{

	 Bank b = new HDFCBank();
	 b.transferFunds();
}
}

interface Bank{
	
	int x = 10;
	void transferFunds();
	//public abstract void transferFunds();
	void balanceEnquiry();
}

class HDFCBank implements Bank{
	
	public void transferFunds(){
		System.out.println("transferFunds");
	}
	
	public void balanceEnquiry(){
		System.out.println("balanceEnquiry");
	}
	
}