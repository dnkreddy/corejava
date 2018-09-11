//Demo on Singleton design pattern
class Lab311{
public static void main(String args[])throws Exception{
   System.out.println("main method starts");
   Singleton s1 = Singleton.getSingleton();
   Singleton s2  = Singleton.getSingleton();
    Singleton s3  = Singleton.getSingleton();
	 Singleton s4  = Singleton.getSingleton();
	  Singleton s5  = Singleton.getSingleton();
}
}

class Singleton{
	private static Singleton single = null;
	private Singleton(){
		System.out.println("Private constructoor");
	}
	
	public static Singleton  getSingleton(){
		if(single == null){
		single = new Singleton();
		}else{
			return single;
		}
		return single;
	}
	
	
}

