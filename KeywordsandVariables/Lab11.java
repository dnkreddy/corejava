//Demo of final keyword
class Lab11{
public static void main(String args[]){
	//local variable and non final
   int age = 20;
   System.out.println("Age::"+age);
   age = 40;
   System.out.println("Age new::"+age);
   final long phoneNo = 898898;
   System.out.println("PhoneNo::"+phoneNo);
   //we cant change the value because it is final
   //phoneNo = 3534535;
   final long PIN_CODE = 560016;

}
}