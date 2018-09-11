//Demo on clone() method
class Lab293{
public static void main(String args[]){
	int x = 5;
	int y = x;
	System.out.println("x::"+x+"Y::"+y);
	y = y+10;
	System.out.println("x::"+x+"Y::"+y);
	
	Person p1 = new Person(10,"Lavi");
	System.out.println("Pid::"+p1.pid);
	System.out.println("pName::"+p1.pName);
	System.out.println("===========");
	Person p2 = p1;
	System.out.println("Pid::"+p2.pid);
	System.out.println("pName::"+p2.pName);
	
	p2.pid = 202;
	System.out.println("===========");
	System.out.println("p1 Pid::"+p1.pid);
	System.out.println("p2 Pid::"+p2.pid);
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