//Demo on Regular Innerclass
class Lab280{
	int age = 20;
	private long phoneNo = 345;
	
	class Inner{
		public void innerMethod(){
			System.out.println("Inner method::"+age+"::"+phoneNo);
		}
	}
	
	void methodOuter(){
	 System.out.println("method Outer");
     Inner i = new Inner();
     //i.innerMethod();	
	}
	
	public static void main(String args[]){
		System.out.println("main method");
		Lab280 l = new Lab280();
		l.methodOuter();
		Lab280.Inner in = new Lab280().new Inner();
		in.innerMethod();
		
	}
}