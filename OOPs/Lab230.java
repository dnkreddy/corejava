//Demo on Varargs
class Lab230{
public static void main(String args[]){
	Addition a = new Addition();
	//a.add();
	int res = a.add(200);
	int res1 = a.add(200,20);
	System.out.println(res);
	System.out.println(res1);	
}
}

class Addition{
	
	int add(int a,int... b){
		System.out.println("VarArgs::"+a+"::"+b);
		int sum = 0;
		for(int i:b){
			sum = sum+i;
		}
		return sum;
	}
	
}