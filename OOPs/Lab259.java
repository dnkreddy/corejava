//Demo on MethodOveriding
class Lab259{
public static void main(String args[]){
	
 /*Person p = new Person();
 p.sleeping();*/
 /*Student s = new Student();
 s.sleeeping(); */
 Person s = new Student();
 s.sleeping();
	
}
}

class Person{
	public void sleeping(){
		System.out.println("Sleeping on bed");		
	}
}

class Student extends Person{
	public void sleeping(){
		System.out.println("Sleeping on floor");
	}
}