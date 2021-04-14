package view;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Tool {
	
	public static int timerCount;
	
	public static enum messageType {
		SUCCESS,
		WARNING,
		ERROR
	}

	public static void setText(JLabel resultLabel, String resultText, int keepSeconds, messageType type) {
		timerCount = 0;
		
		Timer timer = new Timer();
		TimerTask timerTaks = new TimerTask() {
			
			@Override
			public void run() {
				if (timerCount < 1) {
					resultLabel.setText("  " + resultText);
					
					if (type == messageType.SUCCESS) {
						resultLabel.setBackground(new Color(127,182,123)); //Green
					}
					else if (type == messageType.WARNING) {
						resultLabel.setBackground(new Color(159,177,203)); //Ice Blue(144,180,213)
					}
					else if (type == messageType.ERROR) {
						resultLabel.setBackground(new Color(203,0,0)); //Red
					}
					resultLabel.setOpaque(true);
					
					timerCount++;
				} 
				else {
					timer.cancel();
					resultLabel.setText("");
					resultLabel.setOpaque(false);
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
