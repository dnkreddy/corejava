//Demo on return type
class Lab213{
public static void main(String args[]){
	Bank b = new Bank();
	//String name = null;
	String name = "hdfc";
	boolean resp = b.verifyBank(name);
	System.out.println(resp);
}
}
class Bank{
     boolean verifyBank(String name){
		 boolean result = false;
		 if(name != null && name.equalsIgnoreCase("HDFC")){
			 result = true;
		 }
		 if(name != null && name.equalsIgnoreCase("ICICI")){
			 result = true;
		 }
		 return 200;
		 
	 }	

	 
}