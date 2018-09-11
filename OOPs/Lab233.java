//Demo on Inheritence
class Lab233{
public static void main(String args[]){
  Cat c = new Cat();	
 	c.eat();
	c.walk();
}
}

class Animal{
	void eat(){
		System.out.println("Animal eat() method");
	}
	
}
class Cat extends Animal{
 void walk(){
		System.out.println("Cat walk() method");
	}
}