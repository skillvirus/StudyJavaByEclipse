package TimerEx;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {

	public static int count;
	
	public static void main(String[] args) {
		
		count = 0;
		
		Timer timer = new Timer();
		TimerTask timerTaks = new TimerTask() {
			
			@Override
			public void run() {
				if (count < 5) {
					System.out.println("실행");
					count++;
				}
				else {
					timer.cancel();
				}
			}
		};
		
		timer.schedule(timerTaks, 5000, 2000);
	}
}
