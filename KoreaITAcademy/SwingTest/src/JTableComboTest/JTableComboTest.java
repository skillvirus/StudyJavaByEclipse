package JTableComboTest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class JTableComboTest {
	public static void main(String[] args) {
	    
		JFrame frame = new JFrame("JTableCombo 테스트");
		
		String headers[] = {"이름", "음식"}; //제목
	    String rows[][] = {{"너구리", "치킨"}, {"돼지", "피자"}, {"족제비", "족발"}}; //데이터 값
	    String sports[] = {"치킨", "피자", "족발","기타"}; // 선택 할 수 있는 값(콤보 박스에 넣을 값)
	    
	    JComboBox<String> comboBox = new JComboBox<String>(sports); //콤보박스 생성
	    comboBox.setMaximumRowCount(4); //콤보박스 항목 최대 4개
	    TableCellEditor editor = new DefaultCellEditor(comboBox); //테이블에 생성
	    JTable table = new JTable(new DefaultTableModel(rows, headers)); //테이블 생성
	    table.getColumnModel().getColumn(1).setCellEditor(editor);
	
	    JScrollPane scrollPane = new JScrollPane(table);
	    
	    frame.add(scrollPane, BorderLayout.CENTER);
	    
	    frame.setVisible(true); //화면 보이기
		frame.setPreferredSize(new Dimension(300, 150)); //화면크기
		frame.pack();
		//frame.setLocationRelativeTo(null); //화면 중앙에서 열림
		frame.setLocation(100, 100); //화면 위치		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면을 종료했을때 백그라운드 실행 종료
	}
}
