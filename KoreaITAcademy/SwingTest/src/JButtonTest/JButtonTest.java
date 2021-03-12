package JButtonTest;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
 
public class JButtonTest
{   
    public static void main(String[] args)
    {
    	JFrame frame = new JFrame("JButton 테스트");
        
        JPanel buttonPanel = new JPanel(); //버튼을 넣기위한 패널 생성
        JButton btn = new JButton("Button"); //'Button'이름을 가진 버튼 생성
        buttonPanel.add(btn); //버튼 넣기
        
        JLabel lblHobby = new JLabel("취미"); //'취미'레이블
        JCheckBox check1 = new JCheckBox("운동"); //체크박스
        JCheckBox check2 = new JCheckBox("독서");
        JCheckBox check3 = new JCheckBox("영화감상");
        buttonPanel.add(lblHobby);
        buttonPanel.add(check1);
        buttonPanel.add(check2);
        buttonPanel.add(check3);
        
        JLabel lblMale = new JLabel("성별"); //'성별'레이블
        JRadioButton rb1 = new JRadioButton("남자"); //라디오버튼
        JRadioButton rb2 = new JRadioButton("여자");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        buttonPanel.add(lblMale);
        buttonPanel.add(rb1);
        buttonPanel.add(rb2);
        
        frame.add(buttonPanel);
    	
    	frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(240, 150)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
    }
 
}