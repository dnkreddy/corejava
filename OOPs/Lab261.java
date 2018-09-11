//Demo on MethodOveriding
class Lab261{
public static void main(String args[]){
	 Student s = new Student();
	 s.eating();
}
}

class Person{
	public void sleeping(){
		System.out.println("Person sleeping on bed");		
	}
	public void walking(){
		System.out.println("Person walking");
	}
}

class Student extends Person{
	public void sleeping(){
		System.out.println("Student Sleeping on floor");
	}
	public void walking(){
		System.out.println("Student walking");
	}
	public void eating(){
		System.out.println("Student is eating");
	}
}