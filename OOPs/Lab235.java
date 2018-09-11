//Demo on Inheritence
class Lab235{
public static void main(String args[]){
  Cat c = new Cat();	
 	c.eat();
	c.walk();
	System.out.println(c.hashCode());
	c.print();
}
}

class Animal{
	int noOfLegs = 4;
	int weight = 200;
	void eat(){
		System.out.println("Animal eat() method");
	}
	
}
class Cat extends Animal{
	String name = "tommy";
   void walk(){
		System.out.println("Cat walk() method");
	}
	
	void shout(){
		System.out.println("Cat make maw maw");
	}
	void print(){
		System.out.println(noOfLegs);
		System.out.println(weight);
		System.out.println(name);
	}
}