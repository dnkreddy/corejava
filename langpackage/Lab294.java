//Demo on clone() method
class Lab294{
public static void main(String args[])throws Exception{
	Person p1 = new Person(120,"Lavi");
	System.out.println("p1 pid::"+p1.pid);
	Person p2 = (Person)p1.clone();
	System.out.println("p2 pid::"+p2.pid);
	p2.pid = 202;
	System.out.println("===========");
	System.out.println("p1 pid::"+p1.pid);
	System.out.println("p2 pid::"+p2.pid);
}
}
class Person implements Cloneable{
	int pid;
	String pName;
	Person(int id,String name){
		this.pid = id;
		this.pName  = name;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}