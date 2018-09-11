//Demo on Queue utility class
import java.util.*;
public class Lab388{
public static void main(String args[]){
	
	Queue<String> que = new PriorityQueue<String>();
	que.offer("kumar");
	que.offer("anil");
	que.offer("naveen");
		
	System.out.println(que);
	
	System.out.println("Peek::"+que.peek());
	System.out.println(que);
	
	System.out.println("poll::"+que.poll());
	System.out.println(que);
	
	que.iterator();
}
}

