//Demo on clone() method
class Lab295{
public static void main(String args[])throws Exception{
	
	Address a1 = new Address();
	a1.streetName="Marathahalli";
	a1.city="Bglr";
	Person p1 = new Person(120,"Lavi",a1);
	System.out.println("P1 id::"+p1.pid);
	System.out.println("p1 streetName::"+p1.addr.streetName);
	System.out.println("=====");
	Person p2 = (Person)p1.clone();
	System.out.println("P2 id::"+p2.pid);
	System.out.println("p2 streetName::"+p2.addr.streetName);
	
	p2.pid= 202;
	p2.addr.streetName="ShanthiLayout";
	System.out.println("=====After changing p2 values====");
	
	System.out.println("P1 id::"+p1.pid);
	System.out.println("p1 streetName::"+p1.addr.streetName);

	System.out.println("P2 id::"+p2.pid);
	System.out.println("p2 streetName::"+p2.addr.streetName);
	
}
}
class Person implements Cloneable{
	int pid;
	String pName;
	Address addr;
	Person(int id,String name,Address addr){
		this.pid = id;
		this.pName  = name;
		this.addr= addr;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}

class Address{
	String streetName;
	String city;
}