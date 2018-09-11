//Demo on Varargs
class Lab225{
public static void main(String args[]){
	Addition a = new Addition();
	int res = a.add(200,20);
	int res1 = a.add(200,20,30);
	System.out.println(res);
	System.out.println(res1);
	
}
}

class Addition{
	
	int add(int a,int b){
		return a+b;
	}
	int add(int a,int b,int c){
		return a+b+c;
	}
	int add(int a,int b,int c,int d){
		return a+b+c+d;
	}
}