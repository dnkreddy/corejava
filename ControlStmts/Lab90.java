//Demo on if else Control stmt
class Lab90{
public static void main(String args[]){ 
System.out.println("Start of main method");
int a = 10;
int b = 20;
int c = 15;
if(a>b&&a>c){
	System.out.println("a is max value");
}else if(b>a&&b>c){
	System.out.println("b is max value");
}else{
	System.out.println("c is max value");
}
System.out.println("End of main method");
}
}