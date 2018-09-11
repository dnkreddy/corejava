//Demo on Array
class Lab128{
	
public static void main(String args[]){
	int x[] = new int[0];
	int x1[] = new int[10];
    //int x2[]  = new int[-1];
	//incompatible type 
	//allowed only int
	//String x3[] = new String[123.45];
	// allowable array size
	//is max int value 2147483647
	String x4[] = new String[23456];
	String x5[] = new String[(int)123.45];
}
}