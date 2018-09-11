//Demo on Varargs
class Lab226{
public static void main(String args[]){
	Addition a = new Addition();
	a.add();
	int res = a.add(200);
	int res1 = a.add(200,20);
	System.out.println(res);
	System.out.println(res1);	
}
}

class Addition{
	
	int add(int... a){
		System.out.println("VarArgs::"+a);
		int sum = 0;
		for(int i:a){
			sum = sum+i;
		}
		return sum;
	}
	
}