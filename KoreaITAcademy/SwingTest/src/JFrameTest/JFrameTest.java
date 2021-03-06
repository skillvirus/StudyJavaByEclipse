package JFrameTest;

import java.awt.Dimension;
import javax.swing.JFrame;

public class JFrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(800, 600)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
	}
}
