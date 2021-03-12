package JTableTest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("JTable 테스트");
		
		String title[] = {"ID", "이름", "전화번호"};
	    String data[][] =	{
					        	{"1", "홍길동", "010-1111-1111"},
					            {"2", "이순신", "010-2222-2222"},
					            {"3", "강감찬", "010-3333-3333"},
					            {"4", "강감찬", "010-3333-3333"},
					            {"5", "강감찬", "010-3333-3333"},
					            {"6", "강감찬", "010-3333-3333"},
					            {"7", "강감찬", "010-3333-3333"},
					            {"8", "강감찬", "010-3333-3333"}
					            					            
					        };
		    
	    JTable table = new JTable(data, title); //매개변수(데이터, 타이틀)
        JScrollPane sp = new JScrollPane(table); //JTable 스크롤
	    frame.getContentPane().add(sp, BorderLayout.CENTER); //테이블 위치
	        
		frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(300, 150)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
	}

}
