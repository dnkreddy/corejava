//Demo on Timer utility class
import java.util.*;
public class Lab387{
public static void main(String args[]){
	new Task(5);
}
}
class Task{
	
	Timer timer;
	public Task(int time){
		timer = new Timer();
		timer.schedule(new ActualTask(),time*1000);
	}
	
	class ActualTask extends TimerTask{
		public void run(){
			System.out.println("Iam doing my task");
			timer.cancel();
		}
	}
}

