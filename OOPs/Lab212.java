//Demo on return type
class Lab212{
public static void main(String args[]){
	Bank b = new Bank();
	String name = null;
	b.verifyBank(name);
}
}
class Bank{
     void verifyBank(String name){
		 boolean result = false;
		 if(name.equals("HDFC")){
			 result = true;
		 }
		 if(name.equals("ICICI")){
			 result = true;
		 }
		 return result;
		 
	 }	

	 
}