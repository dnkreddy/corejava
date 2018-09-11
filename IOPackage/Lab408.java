//Demo for Externalizable
import java.io.*;
class Lab408{
public static void main(String args[])throws Exception{
	Student s = new Student();
	s.sid = 200;
	s.marks = 300;
	s.bankBal = 400;
	s.studName="Lavistud";
	
	//Serialization
	FileOutputStream fos = new FileOutputStream("D:\\stud.ser");
	ObjectOutputStream os = new ObjectOutputStream(fos);
	os.writeObject(s);
	System.out.println("Serialization done");
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
