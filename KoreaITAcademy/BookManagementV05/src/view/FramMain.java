package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramMain window = new FramMain();
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
	public FramMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelMain panelMain = new PanelMain();
		frame.getContentPane().add(panelMain, BorderLayout.CENTER);
		
		PanelUserInfoSelect panelUserInfoSelect = new PanelUserInfoSelect();
		frame.getContentPane().add(panelUserInfoSelect, BorderLayout.CENTER);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				panelMain.setVisible(true);
				panelUserInfoSelect.setVisible(false);
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("파일");
		mnNewMenu.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("홈");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(true);
				panelUserInfoSelect.setVisible(false);
			}
		});
		mntmNewMenuItem.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("닫기");
		mntmNewMenuItem_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("사용자 정보 관리");
		mnNewMenu_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("사용자 정보 등록");
		mntmNewMenuItem_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("사용자 정보 수정");
		mntmNewMenuItem_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("사용자 정보 삭제");
		mntmNewMenuItem_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("사용자 정보 조회");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(false);
				panelUserInfoSelect.setVisible(true);
			}
		});
		mntmNewMenuItem_12.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_2 = new JMenu("도서 정보 관리");
		mnNewMenu_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("도서 정보 등록");
		mntmNewMenuItem_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("도서 정보 수정");
		mntmNewMenuItem_6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("도서 정보 삭제");
		mntmNewMenuItem_7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("도서 정보 조회");
		mntmNewMenuItem_8.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_3 = new JMenu("도서 대여 관리");
		mnNewMenu_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("도서 대출 등록");
		mntmNewMenuItem_9.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("도서 반납 등록");
		mntmNewMenuItem_10.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("도서 대여 이력 조회");
		mntmNewMenuItem_11.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_4 = new JMenu("도움말");
		mnNewMenu_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuBar.add(mnNewMenu_4);
		
		JLabel labelStatus = new JLabel(" ");
		frame.getContentPane().add(labelStatus, BorderLayout.SOUTH);
	}

}
