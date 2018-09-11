//Demo on DeSerialization
import java.io.*;
class Lab406{
public static void main(String args[])throws Exception
{
	System.out.println("====DeSerialiazation started====");
	FileInputStream fis = new FileInputStream("E:\\student.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
    Student st = (Student)ois.readObject();
    ois.close();
	System.out.println("sid::"+st.sid);
	System.out.println("sname::"+st.sname);
	System.out.println("email::"+st.email);
	System.out.println("personType::"+st.pertype);
   System.out.println("====DeSerialiazation Done====");	
}
}

class Student extends Person implements Serializable{
	
	final static long serialVersionUID= 100l;
	
	int sid;
	transient String sname;
	static String email = "naveen@gmail.com";
	
	public Student(int id,String name,String email){	
		this.sid = id;
		this.sname = name;
		this.email = email;
	}
	
}


class Person{
	
	String pertype;
	
}