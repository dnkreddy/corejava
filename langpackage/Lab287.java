//Demo on Object().hashCode() method
class Lab287{
public static void main(String args[]){
	Person p1 = new Person(10,"lavi");
	System.out.println(p1.hashCode());
	
	Person p2 = new Person(10,"lavi");
	System.out.println(p2.hashCode());
}
}
class Person{
	int pid;
	String pName;
	Person(int id,String name){
		this.pid = id;
		this.pName  = name;
	}
	
	public int hashCode(){
		return pid*100;
	}
}