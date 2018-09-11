//Demo on Serialization
import java.io.*;
class Lab403{
public static void main(String args[])throws Exception
{
	System.out.println("====Serialiazation started====");
    Student st = new Student(10,"Lavi","lavi@gmail.com");
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
	
	public Student(int id,String name,String email){	
		this.sid = id;
		this.sname = name;
		this.email = email;
	}
	
}