//Demo on finalize() method
class Lab297{
public static void main(String args[])throws Exception{
  Person[] p1 = new Person[75];
  for(int i=0;i<p1.length;i++){
	  System.out.println(i);
	 //Person p = new Person("Lavi"+i);
	 //p1[i] = p;
	 Person p2 = new Person("Lavi"+i);
	 //System.runFinalization();
	 //System.gc();
	 
	 Runtime rt = Runtime.getRuntime();
	 //rt.gc();
	 //rt.runFinalization();
	 p2 = null;
  }
}
}
class Person {
	String name;
	Person(String name){
		this.name = name;
	}
	double[] bal = new double[1234567];
	public void finalize(){
		System.out.println("iam in finalize method::"+name);
	}
}
