package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Viewer {

	private JFrame frmMain;
	private JMenuBar mnubMain;
	private JMenu mnuFile;
	private JMenuItem mnuiHome;
	private JMenuItem mnuiEnd;
	private JMenu mnuUserInfoMng;
	private JMenuItem mnuiUserInfoInsert;
	private JMenuItem mnuiUserInfoDelete;
	private JMenuItem mnuiUserInfoUpdate;
	private JMenuItem mnuiUserInfoSelect;
	private JMenu mnuBookInfoMng;
	private JMenuItem mnuiBookInfoInsert;
	private JMenuItem mnuiBookInfoDelete;
	private JMenuItem mnuiBookInfoUpdate;
	private JMenuItem mnuiBookInfoSelect;
	private JMenu mnuBookRentalMng;
	private JMenuItem mnuiBookRentalInsert;
	private JMenuItem mnuiBookReturnInsert;
	private JMenuItem mnuiBookRentalHistorySelect;
	private JMenu mnuHelp;
	private JPanel pnlMain;
	private JLabel lblMainTitle;
	private JLabel lblResultInfo;
	private JPanel pnlUserInfoInsert;
	private JLabel lblUserInfoInsertPnlTitle;
	private JPanel pnlUserInfoDelete;
	private JLabel lblUserInfoDeletePnlTitle;
	private JPanel pnlUserInfoUpdate;
	private JLabel lblUserInfoUpdatePnlTitle;
	private JPanel pnlUserInfoSelect;
	private JLabel lblUserInfoSelectPnlTitle;
	private JPanel pnlBookInfoInsert;
	private JLabel lblBookInfoInsertPnlTitle;
	private JPanel pnlBookInfoDelete;
	private JLabel lblBookInfoDeletePnlTitle;
	private JPanel pnlBookInfoUpdate;
	private JLabel lblBookInfoUpdatePnlTitle;
	private JPanel pnlBookInfoSelect;
	private JLabel lblBookInfoSelectPnlTitle;
	private JPanel pnlBookRentalInsert;
	private JLabel lblBookRentalInsertPnlTitle;
	private JPanel pnlBookReturnInsert;
	private JLabel lblBookReturnInsertPnlTitle;
	private JPanel pnlBookRentalHistorySelect;
	private JLabel lblBookRentalHistorySelectPnlTitle;

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
		frmMain.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setPanelVisible("pnlMain");
			}
		});		
		
		mnubMain = new JMenuBar();
		mnubMain.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.setBounds(0, 0, 634, 23);
		frmMain.getContentPane().add(mnubMain);
		
		mnuFile = new JMenu("파일");
		mnuFile.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuFile);
		
		mnuiHome = new JMenuItem("홈");
		mnuiHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlMain");
			}
		});
		mnuiHome.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuFile.add(mnuiHome);
		
		mnuiEnd = new JMenuItem("종료");
		mnuiEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuiEnd.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuFile.add(mnuiEnd);
		
		mnuUserInfoMng = new JMenu("사용자 정보 관리");
		mnuUserInfoMng.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuUserInfoMng);
		
		mnuiUserInfoInsert = new JMenuItem("사용자 정보 등록");
		mnuiUserInfoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoInsert");
			}
		});
		mnuiUserInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoInsert);
		
		mnuiUserInfoDelete = new JMenuItem("사용자 정보 삭제");
		mnuiUserInfoDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoDelete");
			}
		});
		mnuiUserInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoDelete);
		
		mnuiUserInfoUpdate = new JMenuItem("사용자 정보 수정");
		mnuiUserInfoUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoUpdate");
			}
		});
		mnuiUserInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoUpdate);
		
		mnuiUserInfoSelect = new JMenuItem("사용자 정보 조회");
		mnuiUserInfoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoSelect");
			}
		});
		mnuiUserInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoSelect);
		
		mnuBookInfoMng = new JMenu("도서 정보 관리");
		mnuBookInfoMng.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuBookInfoMng);
		
		mnuiBookInfoInsert = new JMenuItem("도서 정보 등록");
		mnuiBookInfoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoInsert");
			}
		});
		mnuiBookInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoInsert);
		
		mnuiBookInfoDelete = new JMenuItem("도서 정보 삭제");
		mnuiBookInfoDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoDelete");
			}
		});
		mnuiBookInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoDelete);
		
		mnuiBookInfoUpdate = new JMenuItem("도서 정보 수정");
		mnuiBookInfoUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoUpdate");
			}
		});
		mnuiBookInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoUpdate);
		
		mnuiBookInfoSelect = new JMenuItem("도서 정보 조회");
		mnuiBookInfoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoSelect");
			}
		});
		mnuiBookInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoSelect);
		
		mnuBookRentalMng = new JMenu("도서 대여 관리");
		mnuBookRentalMng.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuBookRentalMng);
		
		mnuiBookRentalInsert = new JMenuItem("도서 대출 등록");
		mnuiBookRentalInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookRentalInsert");
			}
		});
		mnuiBookRentalInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookRentalInsert);
		
		mnuiBookReturnInsert = new JMenuItem("도서 반납 등록");
		mnuiBookReturnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookReturnInsert");
			}
		});
		mnuiBookReturnInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookReturnInsert);
		
		mnuiBookRentalHistorySelect = new JMenuItem("도서 대여 이력 조회");
		mnuiBookRentalHistorySelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookRentalHistorySelect");
			}
		});
		mnuiBookRentalHistorySelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookRentalHistorySelect);
		
		mnuHelp = new JMenu("도움말");
		mnuHelp.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mnubMain.add(mnuHelp);
		
		pnlMain = new JPanel();
		pnlMain.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlMain);
		pnlMain.setLayout(null);
		
		lblMainTitle = new JLabel("도서 대여 관리 프로그램");
		lblMainTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 22));
		lblMainTitle.setBounds(0, 125, 634, 57);
		pnlMain.add(lblMainTitle);
		
		lblResultInfo = new JLabel("");
		lblResultInfo.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblResultInfo.setBounds(0, 358, 634, 23);
		frmMain.getContentPane().add(lblResultInfo);
		
		pnlUserInfoInsert = new JPanel();
		pnlUserInfoInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoInsert);
		pnlUserInfoInsert.setLayout(null);
		
		lblUserInfoInsertPnlTitle = new JLabel("[사용자 정보 등록]");
		lblUserInfoInsertPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertPnlTitle);
		
		pnlUserInfoDelete = new JPanel();
		pnlUserInfoDelete.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoDelete);
		pnlUserInfoDelete.setLayout(null);
		
		lblUserInfoDeletePnlTitle = new JLabel("[사용자 정보 삭제]");
		lblUserInfoDeletePnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoDeletePnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoDelete.add(lblUserInfoDeletePnlTitle);
		
		pnlUserInfoUpdate = new JPanel();
		pnlUserInfoUpdate.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoUpdate);
		pnlUserInfoUpdate.setLayout(null);
		
		lblUserInfoUpdatePnlTitle = new JLabel("[사용자 정보 수정]");
		lblUserInfoUpdatePnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoUpdatePnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdatePnlTitle);
		
		pnlUserInfoSelect = new JPanel();
		pnlUserInfoSelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoSelect);
		pnlUserInfoSelect.setLayout(null);
		
		lblUserInfoSelectPnlTitle = new JLabel("[사용자 정보 조회]");
		lblUserInfoSelectPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoSelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectPnlTitle);
		
		pnlBookInfoInsert = new JPanel();
		pnlBookInfoInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoInsert);
		pnlBookInfoInsert.setLayout(null);
		
		lblBookInfoInsertPnlTitle = new JLabel("[도서 정보 등록]");
		lblBookInfoInsertPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookInfoInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoInsert.add(lblBookInfoInsertPnlTitle);
		
		pnlBookInfoDelete = new JPanel();
		pnlBookInfoDelete.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoDelete);
		pnlBookInfoDelete.setLayout(null);
		
		lblBookInfoDeletePnlTitle = new JLabel("[도서 정보 삭제]");
		lblBookInfoDeletePnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookInfoDeletePnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoDelete.add(lblBookInfoDeletePnlTitle);
		
		pnlBookInfoUpdate = new JPanel();
		pnlBookInfoUpdate.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoUpdate);
		pnlBookInfoUpdate.setLayout(null);
		
		lblBookInfoUpdatePnlTitle = new JLabel("[도서 정보 수정]");
		lblBookInfoUpdatePnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookInfoUpdatePnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoUpdate.add(lblBookInfoUpdatePnlTitle);
		
		pnlBookInfoSelect = new JPanel();
		pnlBookInfoSelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoSelect);
		pnlBookInfoSelect.setLayout(null);
		
		lblBookInfoSelectPnlTitle = new JLabel("[도서 정보 조회]");
		lblBookInfoSelectPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookInfoSelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoSelect.add(lblBookInfoSelectPnlTitle);
		
		pnlBookRentalInsert = new JPanel();
		pnlBookRentalInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookRentalInsert);
		pnlBookRentalInsert.setLayout(null);
		
		lblBookRentalInsertPnlTitle = new JLabel("[도서 대출 등록]");
		lblBookRentalInsertPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookRentalInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookRentalInsert.add(lblBookRentalInsertPnlTitle);
		
		pnlBookReturnInsert = new JPanel();
		pnlBookReturnInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookReturnInsert);
		pnlBookReturnInsert.setLayout(null);
		
		lblBookReturnInsertPnlTitle = new JLabel("[도서 반납 등록]");
		lblBookReturnInsertPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookReturnInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookReturnInsert.add(lblBookReturnInsertPnlTitle);
		
		pnlBookRentalHistorySelect = new JPanel();
		pnlBookRentalHistorySelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookRentalHistorySelect);
		pnlBookRentalHistorySelect.setLayout(null);
		
		lblBookRentalHistorySelectPnlTitle = new JLabel("[도서 대여 이력 조회]");
		lblBookRentalHistorySelectPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblBookRentalHistorySelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookRentalHistorySelect.add(lblBookRentalHistorySelectPnlTitle);
	}
	
	/*
	 * 리플렉션(객체를 통해 클래스의 정보를 알아냄)을 이용하여 Panel Visible 설정 
	 */
	private void setPanelVisible(String panelName) {
		try {
			Class<?> c = Class.forName("view.Viewer");
			Field[] allField = c.getDeclaredFields();
			
			for (Field field : allField){
				if (field.getType().getName().equals("javax.swing.JPanel")) { //panel 일 때
					//field.setAccessible(true); //private 멤버에 접근 가능하게 설정
					
					JPanel p = (JPanel)field.get(this); //JPanel로 형변환
					
					if (field.getName().equals(panelName)) {
						p.setVisible(true);
					} else {
						p.setVisible(false);
					}
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
