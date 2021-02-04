package lecture.example;
import javax.swing.JOptionPane;

public class JOptionPanePracticeNo5 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(
							null, //Component parentComponent : 어떤 프레임에서 나타낼지 정함 
							"이름을 입력하세요.", //Object message : 출력할 문자 자체를 기입
							"입력", //String title : 제목표시줄
							JOptionPane.INFORMATION_MESSAGE //int messageType : 알림창의 메시지 종류
						 );
			
		String age = JOptionPane.showInputDialog(
							null, 
							"나이를 입력하세요.",
							"입력",
							JOptionPane.INFORMATION_MESSAGE
						 );
		
		String height = JOptionPane.showInputDialog(
							null, 
							"키를 입력하세요.",
							"입력",
							JOptionPane.INFORMATION_MESSAGE
						 );
		
		String weight = JOptionPane.showInputDialog(
							null, 
							"키를 입력하세요.",
							"입력",
							JOptionPane.INFORMATION_MESSAGE
						 );
		
		System.out.println("당신의 이름은 \"" + name + "\"입니다.");
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println("당신의 키는 " + height + "cm 입니다.");
		System.out.println("당신의 몸무게는 " + weight + "kg 입니다.");
	}

}
