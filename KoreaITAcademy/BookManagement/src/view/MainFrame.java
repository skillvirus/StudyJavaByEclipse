package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();	
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelMain = new JPanel();
		frame.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);
		
		JLabel labelStatus = new JLabel(" ");
		frame.getContentPane().add(labelStatus, BorderLayout.SOUTH);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("파일");
		menuBar.add(menuFile);
		
		JMenuItem menuItemClose = new JMenuItem("닫기");
		menuFile.add(menuItemClose);
		
		JMenu menuBaseInfo = new JMenu("기본 정보 관리");
		menuBar.add(menuBaseInfo);
		
		JMenuItem menuItemBookInfo = new JMenuItem("도서 정보 관리");
		menuItemBookInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IFrameBookInfo iFrameBookInfo = new IFrameBookInfo();
				panelMain.add(iFrameBookInfo);
				iFrameBookInfo.setBounds(5, 5, 700, 500);
				iFrameBookInfo.setVisible(true);
			}
		});
		menuBaseInfo.add(menuItemBookInfo);
		
		JMenuItem menuItemUserInfo = new JMenuItem("사용자 정보 관리");
		menuBaseInfo.add(menuItemUserInfo);
		
		JMenu menuBookInOut = new JMenu("대여 정보 관리");
		menuBar.add(menuBookInOut);
		
		JMenuItem menuItemBookOut = new JMenuItem("대출 정보 등록");
		menuBookInOut.add(menuItemBookOut);
		
		JMenuItem menuItemBookIn = new JMenuItem("반납 정보 등록");
		menuBookInOut.add(menuItemBookIn);
		
		JMenuItem menuItemBookInOutSearch = new JMenuItem("대여 이력 조회");
		menuBookInOut.add(menuItemBookInOutSearch);
		
		JMenu menuHelp = new JMenu("도움말");
		menuBar.add(menuHelp);
	}
}
