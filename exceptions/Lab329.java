//Demo on custom RuntimeException 
class Lab329{
public static void main(String args[]){
 	System.out.println("Main method starts");
	UserDetails details = new UserDetails();
	details.getUserDetails();
	System.out.println("Main method ends");
}
}
class UserDetails{
	void getUserDetails(){	
		String user = null;
		try{	
		//get user details
		System.out.println(user.toUpperCase());
		}catch(Exception ex){
		throw new UserNotFoundException("User does not exit.");	
		}	
	}	
}

class UserNotFoundException extends RuntimeException{
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