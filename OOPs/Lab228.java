//Demo on Varargs
class Lab228{
public static void main(String args[]){
	Addition a = new Addition();
	//a.add();
	int[] arr1 = new int[]{10,20};
	int res = a.add(arr1,10);
	int res1 = a.add(arr1,20);
	System.out.println(res);
	System.out.println(res1);	
}
}

class Addition{
	
	int add(int[] a,int b){
		System.out.println("Array::"+a);
		int sum = 0;
		for(int i:a){
			sum = sum+i;
		}
		return sum;
	}
	
}