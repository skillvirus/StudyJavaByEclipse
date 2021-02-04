package lecture.example;
import javax.swing.JOptionPane;

public class JOptionPanePracticeNo4 {

	public static void main(String[] args) {
		String[] answer = {"첫번째값", "두번째값", "세번째값"};
		int returnAnswer = JOptionPane.showOptionDialog(
															null, //Component parentComponent : 어떤 프레임에서 나타낼지 정함
															"각 버튼의 값은?", //Object message : 출력할 문자 자체를 기입
															"확인", //String title : 제목표시줄
															JOptionPane.YES_NO_CANCEL_OPTION, //int optionType : 사용자의 대답 선택 버튼 표헌
															JOptionPane.INFORMATION_MESSAGE, //int messageType : 알림창의 메시지 종류
															null, //Icon icon : Icon클래스
															answer, //Object[] options : 각 버튼에 다른 문자를 대입
															answer[0] //Object initialSelectionValue : 기본 버튼
													   );
		int convertAnswer = returnAnswer + 1;
		System.out.println("버튼 값 : " + convertAnswer);
	}

}
