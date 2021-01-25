package lecture.example;
import javax.swing.JOptionPane;

public class JOptionPanePracticeNo6 {

	public static void main(String[] args) {
		String[] selMonth = {"선택하세요", "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
		
		String month = (String)JOptionPane.showInputDialog(
							null, 
							"생일 월을 선택하세요.",
							"입력",
							JOptionPane.INFORMATION_MESSAGE,
							null,
							selMonth,
							selMonth[0]
						 );
					
		System.out.println("당신의 생일은 " + month + "입니다.");
	}

}
