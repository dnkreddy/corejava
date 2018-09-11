//Demo on Immutable Object
class Lab313{
public static void main(String args[])throws Exception{
Person p1 = new Person(10,"Lavi1"); 
System.out.println(p1.getAge());
System.out.println(p1.getName());
}
}
class Person{
  private final int age;
  private final String name;
  
  public Person(int age,String name){
	  this.age = age;
	  this.name = name;
  } 
  public int getAge(){
	  return age;
  }
  public String getName(){
	  return name;
  }
}
