package lecture.example;
import javax.swing.JOptionPane;

public class JOptionPanePracticeNo2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "정보메시지", "정보", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "의문메시지", "OK?", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "경고메시지", "주의", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "에러메시지", "오류", JOptionPane.ERROR_MESSAGE);
	}

}
