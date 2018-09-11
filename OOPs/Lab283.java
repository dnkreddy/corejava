//Demo on static Innerclass
class Lab283{
	static int age = 20;
	private static  long phoneNo = 345;
	
	static class Inner{
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
		Lab283 l = new Lab283();
		l.methodOuter();
		
		Lab283.Inner in = new Lab283.Inner();
		in.innerMethod();
	}
}