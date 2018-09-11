//Demo on constructors
class Lab182{
public static void main(String args[]){
  Hello h = new Hello();		
}
}
class Hello{

	Hello(int a){
    System.out.println("1 arg int constructor");	
	}
	
	Hello(String a){
    System.out.println("1 arg string constructor");	
	}
}