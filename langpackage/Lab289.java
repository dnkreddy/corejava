//Demo on Object().toString() method
class Lab289{
public static void main(String args[]){
	Person p1 = new Person(10,"lavi");
	System.out.println(p1);
	
	Person p2 = new Person(10,"lavi");
	System.out.println(p2.toString());
}
}
class Person{
	int pid;
	String pName;
	Person(int id,String name){
		this.pid = id;
		this.pName  = name;
	}

}