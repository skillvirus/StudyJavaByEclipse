package view;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Tool {
	
	public static int count;
	
	public static void setText(JLabel resultLabel, String resultText, int keepSeconds) {
		execTimer(resultLabel, resultText, keepSeconds);
	}
	
	public static void execTimer(JLabel resultLabel, String resultText, int keepSeconds) {
		count = 0;
		
		Timer timer = new Timer();
		TimerTask timerTaks = new TimerTask() {
			
			@Override
			public void run() {
				if (count < 1) {
					resultLabel.setText("  " + resultText);
					count++;
				} 
				else {
					timer.cancel();
					resultLabel.setText("");
				}	
			}
		};
		
		timer.schedule(timerTaks, 0, (keepSeconds * 1000));
	}
	
	public static int openAlert(String message) {
		String[] answer = {"확인", "취소"};
		Font font = new Font("맑은 고딕", Font.PLAIN, 12);
	    UIManager.put("OptionPane.messageFont", font);
	    UIManager.put("OptionPane.buttonFont", font);
	    
	    return JOptionPane.showOptionDialog(null, message, "ALERT", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, answer, answer[0]);
	}
}
