//Demo on DeSerialization
import java.io.*;
class Lab404{
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
   System.out.println("====DeSerialiazation Done====");	
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