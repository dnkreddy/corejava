//Demo on instanceof Operator
class Lab76{
public static void main(String args[]){
	Student s1 = new Student();
	Student s2 = new Student();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1 instanceof Student);
	System.out.println(s1 instanceof Object);
	//compile time error
	System.out.println(s1 instanceof Person);
}
}
class Student{
	
}
class Person{
	
}
