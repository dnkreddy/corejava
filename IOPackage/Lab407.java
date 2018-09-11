//Demo on Serialization
import java.io.*;
class Lab407{
public static void main(String args[])throws Exception
{
	System.out.println("====Serialiazation started====");
	Address adr = new Address();
	adr.city= "Bangalore";
    Student st = new Student(10,"Lavi","lavi@gmail.com",adr);
	FileOutputStream fos = new FileOutputStream("E:\\student.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(st);
    oos.close();
   System.out.println("====Serialiazation Done====");	
}

}

class Student  implements Serializable{
	
	final static long serialVersionUID= 100l;
	
	int sid;
		String sname;
	String email;
	Address addr;
	public Student(int id,String name,String email,Address adder){	
		this.sid = id;
		this.sname = name;
		this.email = email;
		this.addr = adder;
	}
	
}
class Address implements Serializable{
	
	String city;
	
	
}