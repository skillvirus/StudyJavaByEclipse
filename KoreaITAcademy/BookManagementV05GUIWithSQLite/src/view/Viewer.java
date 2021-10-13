package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class Viewer {

	private JFrame frmMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewer window = new Viewer();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Viewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle("도서 대여 관리");
		frmMain.setBounds(100, 100, 650, 420);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		JMenuBar mnubMain = new JMenuBar();
		mnubMain.setBounds(0, 0, 634, 23);
		frmMain.getContentPane().add(mnubMain);
		
		JMenu mnuFile = new JMenu("파일");
		mnuFile.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuFile);
		
		JMenuItem mnuiHome = new JMenuItem("홈");
		mnuiHome.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuFile.add(mnuiHome);
		
		JMenuItem mnuiEnd = new JMenuItem("종료");
		mnuiEnd.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuFile.add(mnuiEnd);
		
		JMenu mnuUserInfoMng = new JMenu("사용자 정보 관리");
		mnuUserInfoMng.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuUserInfoMng);
		
		JMenuItem mnuiUserInfoInsert = new JMenuItem("사용자 정보 등록");
		mnuiUserInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoInsert);
		
		JMenuItem mnuiUserInfoDelete = new JMenuItem("사용자 정보 삭제");
		mnuiUserInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoDelete);
		
		JMenuItem mnuiUserInfoUpdate = new JMenuItem("사용자 정보 수정");
		mnuiUserInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoUpdate);
		
		JMenuItem mnuiUserInfoSelect = new JMenuItem("사용자 정보 조회");
		mnuiUserInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoSelect);
		
		JMenu mnuBookInfoMng = new JMenu("도서 정보 관리");
		mnuBookInfoMng.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuBookInfoMng);
		
		JMenuItem mnuiBookInfoInsert = new JMenuItem("도서 정보 등록");
		mnuiBookInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoInsert);
		
		JMenuItem mnuiBookInfoDelete = new JMenuItem("도서 정보 삭제");
		mnuiBookInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoDelete);
		
		JMenuItem mnuiBookInfoUpdate = new JMenuItem("도서 정보 수정");
		mnuiBookInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoUpdate);
		
		JMenuItem mnuiBookInfoSelect = new JMenuItem("도서 정보 조회");
		mnuiBookInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoSelect);
		
		JMenu mnuBookRentalMng = new JMenu("도서 대여 관리");
		mnuBookRentalMng.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuBookRentalMng);
		
		JMenuItem mnuiBookRentalInsert = new JMenuItem("도서 대출 등록");
		mnuiBookRentalInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookRentalInsert);
		
		JMenuItem mnuiBookReturnInsert = new JMenuItem("도서 반납 등록");
		mnuiBookReturnInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookReturnInsert);
		
		JMenuItem mnuiBookRentalHistorySelect = new JMenuItem("도서 대여 이력 조회");
		mnuiBookRentalHistorySelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookRentalHistorySelect);
		
		JMenu mnuHelp = new JMenu("도움말");
		mnuHelp.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuHelp);
	}
}
