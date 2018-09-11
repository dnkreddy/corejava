//Demo on Object().equals() method
class Lab291{
public static void main(String args[]){
	int x = 10;
	int y = 10;
	if(x==y)
		System.out.println("x and y are same");
	
	Person p1 = new Person(10,"lavi");
	Person p2 = new Person(10,"lavi");
	
	if(p1 == p2){
		System.out.println("p1 and p2 are same objects");
	}else {
		System.out.println("Objects are not same");
	}
	
	if(p1.equals(p2)){
		System.out.println("p1 and p2 are same objects-equals");
	}else {
		System.out.println("Objects are not same -equals");
	}
	
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