package JComboBoxTest;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JComboBoxTest {

	public static void main(String[] args) {

    	String name[] = { "홍길동", "이순신", "강감찬 ", "이이", "이황" };
		String count[] = { "1", "2", "3", "4", "5" };
		
		JFrame frame = new JFrame("JComboBox 테스트");

		JList<String> jl;
	    JComboBox<String> com;
		Container c = frame.getContentPane();
		
		c.setLayout(new FlowLayout()); //FlowLayout
		//JPanel p = new JPanel(new GridLayout(1, 2));
        
		//JComboBox에 name 배열 넣기
        com = new JComboBox<String>(name); 
        JScrollPane s = new JScrollPane(com);
        c.add(s);
        
        //JList에 count배열 등록
        jl = new JList<String>(count);
        JScrollPane s1 = new JScrollPane(jl);
        jl.setVisibleRowCount(3);
        c.add(s1);
		
    	frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(250, 300)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
	}

}
