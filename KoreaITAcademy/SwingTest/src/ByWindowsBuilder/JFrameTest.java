package ByWindowsBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JFrameTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTest window = new JFrameTest();
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
	public JFrameTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu file = new JMenu("파일");
		file.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(file);
		
		JMenuItem exit = new JMenuItem("종료");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		file.add(exit);
		
		JMenu bookInfo = new JMenu("도서정보관리");
		menuBar.add(bookInfo);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("도서정보등록");
		bookInfo.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		bookInfo.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		bookInfo.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		bookInfo.add(mntmNewMenuItem_7);
		
		JMenu userInfo = new JMenu("사용자정보관리");
		menuBar.add(userInfo);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		userInfo.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		userInfo.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		userInfo.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		userInfo.add(mntmNewMenuItem_2);
		
		JMenu bookInOut = new JMenu("도서대여관리");
		menuBar.add(bookInOut);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("New menu item");
		bookInOut.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("New menu item");
		bookInOut.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		bookInOut.add(mntmNewMenuItem_8);
		
		JMenu help = new JMenu("도움말");
		menuBar.add(help);
	}
}
