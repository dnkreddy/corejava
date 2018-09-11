//Demo on MethodOveriding
class Lab262{
public static void main(String args[]){
	 Student p = new Student();
	 p.eating();
}
}

class Person{
	public void sleeping(){
		System.out.println("Person sleeping on bed");		
	}
	protected void walking(){
		System.out.println("Person walking");
	}
}

class Student extends Person{
	public void sleeping(){
		System.out.println("Student Sleeping on floor");
	}
	void walking(){
		System.out.println("Student walking");
	}
	public void eating(){
		System.out.println("Student is eating");
	}
}