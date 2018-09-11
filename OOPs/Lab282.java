//Demo on Anonymous Innerclass
class Lab282{
	public static void main(String args[]){
     Person p = new Person(){
		void playing(){
			System.out.println("person playing");
		} 
	 };
	 p.playing();
	 Student s = new Student(){ 
		public void reading(){
			System.out.println("Student reading");
		} 
		 
	 };
	 s.reading();
	}
}

abstract class Person{
	abstract void playing();
}


interface Student{
	void reading();
}

