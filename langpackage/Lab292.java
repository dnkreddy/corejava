//Demo on Object().equals() method
class Lab292{
public static void main(String args[]){
	int x = 10;
	int y = 10;
	if(x==y)
		System.out.println("x and y are same");
	
	Person p1 = new Person(10,"lavi");
	Person p2 = new Person(10,"lavi");
	
	String s1 = "lavi";
	String s2 = "lavi";
	if(s1.equals(s2)){
		System.out.println("Strings are same");
	}else{
		System.out.println("Strings are not same");
	}
	
	if(p1.equals(p2)){
		System.out.println("Person objects are same");
	}else{
		System.out.println("Person objects are not same");
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
	
	public boolean equals(Object obj){
		if(obj instanceof Person){
			Person other = (Person)obj;
			if(this.pid == other.pid && 
			this.pName.equals(other.pName)){
				return true;
			}
			
		}else{
			return false;
		}
		return false;
	}
	
}