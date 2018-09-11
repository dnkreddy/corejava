//Demo on two dimension Array
class Lab138{
	
public static void main(String args[]){
	int[] x2[] = new int[][]{{10,20},{30,40}};
	
	for(int i = 0;i<x2.length;i++){
		for(int j= 0;j<x2[i].length;j++){
			System.out.println("for loop::i:"+i+
			"j:"+j+"::"+x2[i][j]);
		}
	}
	System.out.println("==========");
	for(int[] x:x2){
		for(int y:x){
			System.out.println(y);
		}
	}
}
}