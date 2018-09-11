//Demo on MethodOveriding
class Lab260{
public static void main(String args[]){
	 Person p = new Student();
	 p.sleeping();
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
}