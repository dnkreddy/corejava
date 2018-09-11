//Demo on custom RuntimeException 
class Lab328{
public static void main(String args[]){
 	System.out.println("Main method starts");
	String name = null;
	if(name == null){
		throw new CustomException("Name variable is null");
	}
}
}


class CustomException extends RuntimeException{
  private int errorCode;
  private String errorMsg;
  CustomException(){}
 CustomException(String msg){
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