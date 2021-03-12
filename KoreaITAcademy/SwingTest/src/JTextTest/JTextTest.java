package JTextTest;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class JTextTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("JText 테스트");
		
        frame.setLayout(new FlowLayout()); //FlowLayout사용
        EtchedBorder eborder =  new EtchedBorder(); //Border로 영역 생성
        JLabel lbl = new JLabel("아이디와 패스워드를 입력해 주세요");  //레이블 생성
        
        lbl.setBorder(eborder); //레이블 보더
        frame.add(lbl); //레이블 추가
        
        //id패널과 pw 패널생성
        JPanel idPanel = new JPanel();
        JPanel paPanel = new JPanel();
        JLabel la3 = new JLabel("아이디");
        JLabel la2 = new JLabel("패스워드");
        
        //id텍스트필드와 pw텍스트 필드 선언
        JTextField id = new JTextField(10);
        JPasswordField passwd = new JPasswordField(10);
        idPanel.add(la3);
        idPanel.add(id);
        paPanel.add(la2);
        paPanel.add(passwd);
        
        //로그인과 회원가입을 위한 패널 생성
        JPanel loginPanel = new JPanel();
        JButton b1 = new JButton("로그인");
        JButton b2 = new JButton("회원가입");
        loginPanel.add(b1);
        loginPanel.add(b2);
        frame.add(idPanel);
        frame.add(paPanel);
        frame.add(loginPanel);
        //텍스트에어리어(크기:3행 20열)
        JTextArea content = new JTextArea(3,20);
        JScrollPane s= new JScrollPane(content);
        frame.add(s);
		
    	frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(250, 350)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
	}

}
