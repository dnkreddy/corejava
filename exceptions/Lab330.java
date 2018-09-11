//Demo on custom checked Exception 
class Lab330{
public static void main(String args[])throws UserNotFoundException{
 	System.out.println("Main method starts");
	UserDetails details = new UserDetails();
	//use try catch or throws to throw the exception
	details.getUserDetails();
	System.out.println("Main method ends");
}
}
class UserDetails{
	void getUserDetails()throws UserNotFoundException{	
		String user = null;
		try{	
		//get user details
		System.out.println(user.toUpperCase());
		}catch(Exception ex){
		throw new UserNotFoundException("User does not exit.");	
		}	
	}	
}

class UserNotFoundException extends Exception{
  private int errorCode;
  private String errorMsg;
  UserNotFoundException(){}
	 UserNotFoundException(String msg){
	 super(msg);
	 this.errorMsg = msg;
	 }
	  public String toString(){
	  return errorMsg+":"+errorCode;
	 }
	 public String getMessage(){
	  return errorMsg;
	 }
}