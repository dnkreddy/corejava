//Demo on MethodOveriding
class Lab264{
public static void main(String args[]){
	 Student p = new Student();
	 p.eating();
}
}

class Person{
	private A sleeping(){
		System.out.println("Person sleeping on bed");
     return new A();		
	}
	protected A walking(){
		System.out.println("Person walking");
		return new A();
	}
}

class Student extends Person{
	A sleeping(){
		System.out.println("Student Sleeping on floor");
		return new A();
	}
	public B walking(){
		System.out.println("Student walking");
		return new B();
	}
	public void eating(){
		System.out.println("Student is eating");
	}
}

class A{}
class B extends A{}
