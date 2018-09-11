//Demo on Marker interface
class Lab312{
public static void main(String args[])throws Exception{
  Person p1 = new Person(10);
  Person p2 = (Person)p1.myClone();
  System.out.println(p1.age);
  System.out.println(p2.age);
  
}
}

interface LaviCloneable{
}

class Person implements LaviCloneable{
	
	int age;
	String name;
	public Person(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public Person myClone()throws CloneNotSupportedException{
		Person obj = null;
		if(this instanceof LaviCloneable){
			obj =  new Person(this.age);
		}else{
			throw new CloneNotSupportedException();
		}
		return obj;
	}
	
	
}
