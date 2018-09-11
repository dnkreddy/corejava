//Demo on Arrays utility class
import java.util.*;
public class Lab384{
public static void main(String args[]){
	
	int[] arr = new int[]{20,5,1,10,15};
	
	List list = Arrays.asList(arr);
	System.out.println(list.size());
	
	
	Arrays.sort(arr);
	for(int i:arr){
		System.out.println(i);
	}
	
	int[] arr1 = Arrays.copyOf(arr,arr.length);
	for(int i:arr1){
		System.out.println("Arr1::"+i);
	}
	
	System.out.println(Arrays.equals(arr,arr1));
	
	Arrays.fill(arr1,100);
	for(int i:arr1){
		System.out.println("Array Fill::"+i);
	}
}
}