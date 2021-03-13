package book.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import book.model.DataPack;
import book.model.DatabaseAccessHelper;

public class viewer {

	private JFrame frame;
	private JTextField userInfoInsertID;
	private JTextField userInfoInsertName;
	private JTextField userInfoInsertPhoneNum;
	private JTextField userInfoDeleteID;
	private JTextField userInfoUpdateID;
	private JTextField userInfoUpdatePhoneNum;
	private JTextField userInfoUpdateName;
	private JTable userInfoTable;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewer window = new viewer();
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
	public viewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("도서대여관리");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 432, 238);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("도서 대여 관리");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		lblNewLabel_6.setBounds(78, 55, 255, 124);
		mainPanel.add(lblNewLabel_6);
		
		JPanel userInfoUpdate = new JPanel();
		userInfoUpdate.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoUpdate);
		userInfoUpdate.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("사용자 정보 수정");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(0, 0, 434, 15);
		userInfoUpdate.add(lblNewLabel_1_1);
		
		userInfoUpdateID = new JTextField();
		userInfoUpdateID.setColumns(10);
		userInfoUpdateID.setBounds(68, 41, 116, 21);
		userInfoUpdate.add(userInfoUpdateID);
		
		JLabel lblNewLabel_2_2 = new JLabel("ID");
		lblNewLabel_2_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(12, 44, 57, 15);
		userInfoUpdate.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(12, 73, 57, 15);
		userInfoUpdate.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("전화번호");
		lblNewLabel_4_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(12, 104, 57, 15);
		userInfoUpdate.add(lblNewLabel_4_1);
		
		userInfoUpdatePhoneNum = new JTextField();
		userInfoUpdatePhoneNum.setColumns(10);
		userInfoUpdatePhoneNum.setBounds(68, 101, 116, 21);
		userInfoUpdate.add(userInfoUpdatePhoneNum);
		
		userInfoUpdateName = new JTextField();
		userInfoUpdateName.setColumns(10);
		userInfoUpdateName.setBounds(68, 70, 116, 21);
		userInfoUpdate.add(userInfoUpdateName);
		
		JButton btnNewButton_2_1 = new JButton("수정");
		btnNewButton_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				String queryString;
				
				try {
					queryString = "	UPDATE	UserInfo "
								+ " SET 	UserName = ?,"
								+ "			UserPhoneNum = ?"
								+ "	WHERE	UserID = ?;";
				
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, userInfoUpdateName.getText()));
					dataPack.add(new DataPack(2, userInfoUpdatePhoneNum.getText()));
					dataPack.add(new DataPack(3, userInfoUpdateID.getText()));
					
					databaseAccessHelper.executeNonQuery(queryString, dataPack);
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
					//ex.printStackTrace();
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
			}
		});
		btnNewButton_2_1.setBounds(26, 141, 97, 23);
		userInfoUpdate.add(btnNewButton_2_1);
		
		JPanel userInfoInsert = new JPanel();
		userInfoInsert.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoInsert);
		userInfoInsert.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("사용자 정보 등록");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(0, 0, 434, 15);
		userInfoInsert.add(lblNewLabel_1);
		
		userInfoInsertID = new JTextField();
		userInfoInsertID.setBounds(68, 40, 116, 21);
		userInfoInsert.add(userInfoInsertID);
		userInfoInsertID.setColumns(10);
		
		userInfoInsertName = new JTextField();
		userInfoInsertName.setBounds(68, 69, 116, 21);
		userInfoInsert.add(userInfoInsertName);
		userInfoInsertName.setColumns(10);
		
		userInfoInsertPhoneNum = new JTextField();
		userInfoInsertPhoneNum.setBounds(68, 100, 116, 21);
		userInfoInsert.add(userInfoInsertPhoneNum);
		userInfoInsertPhoneNum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 43, 57, 15);
		userInfoInsert.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(12, 72, 57, 15);
		userInfoInsert.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("전화번호");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(12, 103, 57, 15);
		userInfoInsert.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("저장");
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				String queryString;

				try {
					queryString = "	INSERT INTO UserInfo"
								+ "	("
								+ "		UserID,"
								+ "		UserName,"
								+ " 	UserPhoneNum"
								+ " )"
								+ " VALUES"
								+ " ("
								+ "		?,"
								+ "		?,"
								+ "		?"
								+ " );";
					
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, userInfoInsertID.getText()));
					dataPack.add(new DataPack(2, userInfoInsertName.getText()));
					dataPack.add(new DataPack(3, userInfoInsertPhoneNum.getText()));
					
					databaseAccessHelper.executeNonQuery(queryString, dataPack);
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
//					ex.printStackTrace();
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
			}
		});
		btnNewButton_2.setBounds(26, 141, 97, 23);
		userInfoInsert.add(btnNewButton_2);
		
		JPanel userInfoDelete = new JPanel();
		userInfoDelete.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoDelete);
		userInfoDelete.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사용자 정보 삭제");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(0, 0, 434, 15);
		userInfoDelete.add(lblNewLabel);
		
		userInfoDeleteID = new JTextField();
		userInfoDeleteID.setColumns(10);
		userInfoDeleteID.setBounds(59, 25, 116, 21);
		userInfoDelete.add(userInfoDeleteID);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(3, 28, 57, 15);
		userInfoDelete.add(lblNewLabel_2_1);
		
		JButton btnNewButton_3 = new JButton("삭제");
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				String queryString;
				
				try {
					queryString = "	DELETE "
								+ " FROM 	UserInfo"
								+ "	WHERE	UserID = ?;";
					
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, userInfoDeleteID.getText()));
					
					databaseAccessHelper.executeNonQuery(queryString, dataPack);
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
//					ex.printStackTrace();
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
			}
		});
		btnNewButton_3.setBounds(12, 78, 97, 23);
		userInfoDelete.add(btnNewButton_3);
		
		JPanel userInfoSelect = new JPanel();
		userInfoSelect.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoSelect);
		userInfoSelect.setLayout(null);
		
		String[] userInfoTableColName = {"사용자ID","사용자성명","사용자전화번호"};
		DefaultTableModel userInfoTableModel = new DefaultTableModel(userInfoTableColName, 0);
		
		userInfoTable = new JTable(userInfoTableModel);
		userInfoTable.setBounds(12, 55, 410, 150);
		JScrollPane userInfoScrollPane = new JScrollPane(userInfoTable);
		userInfoScrollPane.setBounds(12, 55, 410, 150);
		userInfoSelect.add(userInfoScrollPane);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				ResultSet resultSet = null;
				String queryString;
				
				try {
					
					queryString = "	SELECT	UserID,"
								+ "			UserName,"
								+ "			UserPhoneNum "
								+ "	FROM 	UserInfo"
								+ "	WHERE	UserID = ?";
				
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, textField_7.getText()));
					resultSet = databaseAccessHelper.executeQuery(queryString, dataPack);
					userInfoTableModel.setNumRows(0);
					while(resultSet.next() ) {
						userInfoTableModel.addRow(new Object[]{
													resultSet.getString("UserID"), 
													resultSet.getString("UserName"),
													resultSet.getString("UserPhoneNum")
												 });
					}
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
				} finally {
					if (resultSet != null) {
						try {
							resultSet.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
			}
		});
		btnNewButton.setBounds(12, 210, 97, 23);
		userInfoSelect.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("사용자 정보 조회");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(0, 0, 434, 15);
		userInfoSelect.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("ID");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(12, 25, 57, 15);
		userInfoSelect.add(lblNewLabel_5);
		
		textField_7 = new JTextField();
		textField_7.setBounds(34, 22, 92, 21);
		userInfoSelect.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("전체조회");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				ResultSet resultSet = null;
				String queryString;
				
				try {
					
					queryString = "	SELECT	UserID,"
								+ "			UserName,"
								+ "			UserPhoneNum "
								+ "	FROM 	UserInfo";
				
					resultSet = databaseAccessHelper.executeQuery(queryString);
					userInfoTableModel.setNumRows(0);
					while(resultSet.next() ) {
						userInfoTableModel.addRow(new Object[]{
													resultSet.getString("UserID"), 
													resultSet.getString("UserName"),
													resultSet.getString("UserPhoneNum")
												 });
					}
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
					if (resultSet != null) {
						try {
							resultSet.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		btnNewButton_1.setBounds(121, 210, 97, 23);
		userInfoSelect.add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("파일");
		mnNewMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("종료");
		mntmNewMenuItem.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("사용자 정보 관리");
		mnNewMenu_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("사용자 정보 등록");
		mntmNewMenuItem_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				userInfoInsert.setVisible(true);
				userInfoUpdate.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("사용자 정보 삭제");
		mntmNewMenuItem_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				userInfoInsert.setVisible(false);
				userInfoUpdate.setVisible(false);
				userInfoDelete.setVisible(true);
				userInfoSelect.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("사용자 정보 수정");
		mntmNewMenuItem_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				userInfoInsert.setVisible(false);
				userInfoUpdate.setVisible(true);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("사용자 정보 조회");
		mntmNewMenuItem_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				userInfoInsert.setVisible(false);
				userInfoUpdate.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("도서 정보 관리");
		mnNewMenu_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("도서 정보 등록");
		mntmNewMenuItem_6.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("도서 정보 삭제");
		mntmNewMenuItem_7.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("도서 정보 수정");
		mntmNewMenuItem_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("도서 정보 조회");
		mntmNewMenuItem_8.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_3 = new JMenu("도서 대여 관리");
		mnNewMenu_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("도서 반출 등록");
		mntmNewMenuItem_9.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("도서 반입 등록");
		mntmNewMenuItem_10.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("도서 대여 이력 조회");
		mntmNewMenuItem_11.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_4 = new JMenu("도움말");
		mnNewMenu_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_4);
	}
}
