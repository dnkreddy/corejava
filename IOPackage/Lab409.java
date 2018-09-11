//Demo for Externalizable
import java.io.*;
class Lab409{
public static void main(String args[])throws Exception{

	//DeSerialization
	FileInputStream fis = new FileInputStream("D:\\stud.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student st = (Student)ois.readObject();
	System.out.println(st.sid);
	System.out.println(st.marks);
	System.out.println(st.bankBal);
	System.out.println(st.studName);
	System.out.println("DeSerialization done");
}
}
class Student implements Externalizable{
	public Student(){
				
	}
    static final long serialVersionUID = 2345L;
	int sid;
	int marks;
	int bankBal;
	String studName;
	public void writeExternal(ObjectOutput o)throws IOException{
		o.writeInt(sid);
		o.writeObject(studName);
	}
	
	
	public void readExternal(ObjectInput i)throws IOException, ClassNotFoundException{
		sid = i.readInt();
		studName = i.readObject().toString();
	}
}
