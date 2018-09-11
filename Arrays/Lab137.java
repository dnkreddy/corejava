//Demo on two dimension Array
class Lab137{
	static int[] x2[];
public static void main(String args[]){
	x2 = new int[2][2];
	x2[0][0] = 10;
	x2[0][1] = 20;
	x2[1][0] = 30;
	x2[1][1] = 20;
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