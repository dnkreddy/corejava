//Demo on Object().toString() method
class Lab290{
public static void main(String args[]){
	Person p1 = new Person(10,"lavi");
	System.out.println(p1);
	
	Person p2 = new Person(10,"lavi");
	System.out.println(p2.toString());
	
	String name = "lavi";
	System.out.println(name);
}
}
class Person{
	int pid;
	String pName;
	Person(int id,String name){
		this.pid = id;
		this.pName  = name;
	}
	
	public String toString(){
		return ""+pid+"::"+pName;
	}

}