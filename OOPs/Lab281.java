//Demo on Method Local Innerclass
class Lab281{
	int age = 20;
	private long phoneNo = 345;	
	void methodOuter(){
	 System.out.println("method Outer");
       class Inner{
			public void innerMethod(){
				System.out.println("Inner method::"+age+"::"+phoneNo);
			}
	    }
		System.out.println("method Outer inner class instance");
		Inner i = new Inner();
		i.innerMethod();
	}
	
	public static void main(String args[]){
		System.out.println("main method");
		Lab281 l = new Lab281();
		l.methodOuter();	
	}
}