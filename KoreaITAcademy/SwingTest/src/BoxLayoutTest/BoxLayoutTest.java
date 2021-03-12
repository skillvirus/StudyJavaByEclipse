package BoxLayoutTest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BoxLayoutTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("BoxLayout 테스트");
		
		JRadioButton r1,r2;
        
        frame.setLayout(new BorderLayout()); //frame 전체 레이아웃(BorderLayout)
        
        Box left = Box.createVerticalBox(); //박스 레이아웃 추가
        
        ButtonGroup radioGroup = new ButtonGroup(); //라디오버튼을 위한 버튼 그룹
        
        //left.add(Box.createVerticalStrut(30)); //간격 조정을 위한 투명 컴포넌트
        radioGroup.add(r1 = new JRadioButton("치킨")); //버튼 객체를 생성 후 버튼 그룹에 추가
        left.add(r1);
        
        //left.add(Box.createVerticalStrut(30));
        radioGroup.add(r2 = new JRadioButton("피자"));
        left.add(r2);
        
        //Box객체 left를 패널에 추가
        JPanel leftPanel = new JPanel(new BorderLayout());
        //패널의 테두리선을 에칭효과로 지정
        leftPanel.setBorder(new TitledBorder( new EtchedBorder(),"음식"));
        leftPanel.add(left, BorderLayout.CENTER);
 
        //수직으로 배치하는 박스레이아웃 생성
        Box right = Box.createVerticalBox();
        //right.add(Box.createVerticalStrut(30));
        
        //체크박스를 생성해 박스레이아웃에 추가
        right.add(new JCheckBox("홍길동"));
        //right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("이순신"));
        //right.add(Box.createVerticalStrut(30));             
        right.add(new JCheckBox("강감찬"));
        //right.add(Box.createVerticalStrut(30));             
        right.add(new JCheckBox("이이"));
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "동물"));  
        rightPanel.add(right, BorderLayout.CENTER);
        
        //수평으로 배치하는 박스레이아웃
        //패널leftPanel과 rightPanel을 박스레이아웃에 배치
        Box center = Box.createHorizontalBox();
        center.add(leftPanel);
        center.add(rightPanel);
        frame.add(center,  BorderLayout.CENTER);
		
		
    	frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(300, 300)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
	}

}
