//Demo on InputStreamReader
import java.io.*;
class Lab401{
public static void main(String args[])throws Exception
{
    InputStreamReader sr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(sr);
	System.out.println("Enter you name:");
	String name = br.readLine();
	System.out.println("Enter your Age:");
	String age = br.readLine();
	System.out.println("Name::Age::"+name+"::"+age);
	
}
}