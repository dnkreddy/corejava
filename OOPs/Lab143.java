class Lab141{
public static void main(String args[]){
	System.out.println("Main method starts");	
	Switch s1 = new Switch();
	System.out.println(s1.length);
	
	Switch s2 = new Switch();
	System.out.println(s2.length);

	System.out.println("Main method ends");	
}
}
class Switch{
	//properties
	int length;
	static String name;	
}