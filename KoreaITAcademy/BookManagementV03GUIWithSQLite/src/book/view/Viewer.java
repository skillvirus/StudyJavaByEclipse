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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Viewer {

	private JFrame frame;
	private JTextField userInfoInsertID;
	private JTextField userInfoInsertName;
	private JTextField userInfoInsertPhoneNum;
	private JTextField userInfoDeleteID;
	private JTable userInfoTable;
	private JTextField userInfoSelectID;
	private JTextField userInfoUpdateID;
	private JTextField userInfoUpdateName;
	private JTextField userInfoUpdatePhoneNum;
	private JTextField bookInfoSelectID;
	private JTable bookInfoTable;
	private JTextField bookInfoInsertID;
	private JTextField bookInfoInsertTitle;
	private JTextField bookInfoInsertISBN;
	private JTextField bookInfoUpdateID;
	private JTextField bookInfoUpdateTitle;
	private JTextField bookInfoUpdateISBN;
	private JTextField bookInfoDeleteID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewer window = new Viewer();
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
	public Viewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("도서 대여 관리");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] userInfoTableColName = {"사용자ID","사용자성명","사용자전화번호"};
		DefaultTableModel userInfoTableModel = new DefaultTableModel(userInfoTableColName, 0);
		
		String[] bookInfoTableColName = {"도서ID","도서제목","도서ISBN"};
		DefaultTableModel bookInfoTableModel = new DefaultTableModel(bookInfoTableColName, 0);
		
		JPanel bookOutInsert = new JPanel();
		bookOutInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookOutInsert.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookOutInsert);
		bookOutInsert.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("도서 반출 등록");
		lblNewLabel_12.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(0, 0, 434, 15);
		bookOutInsert.add(lblNewLabel_12);
		
		JPanel bookInfoDelete = new JPanel();
		bookInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoDelete.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookInfoDelete);
		bookInfoDelete.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("도서 정보 삭제");
		lblNewLabel_10.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(0, 0, 434, 15);
		bookInfoDelete.add(lblNewLabel_10);
		
		bookInfoDeleteID = new JTextField();
		bookInfoDeleteID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoDeleteID.setColumns(10);
		bookInfoDeleteID.setBounds(66, 26, 116, 21);
		bookInfoDelete.add(bookInfoDeleteID);
		
		JButton btnNewButton_3_1 = new JButton("삭제");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				String queryString;
				
				try {
					queryString = "	DELETE "
								+ " FROM 	BookInfo"
								+ "	WHERE	BookID = ?;";
					
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, bookInfoDeleteID.getText()));
					
					databaseAccessHelper.executeNonQuery(queryString, dataPack);
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_3_1.setBounds(20, 57, 97, 23);
		bookInfoDelete.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ID");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(10, 29, 57, 15);
		bookInfoDelete.add(lblNewLabel_2_1_1);
		
		JPanel userInfoDelete = new JPanel();
		userInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoDelete.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoDelete);
		userInfoDelete.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사용자 정보 삭제");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(0, 0, 434, 15);
		userInfoDelete.add(lblNewLabel);
		
		userInfoDeleteID = new JTextField();
		userInfoDeleteID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
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
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
			}
		});
		btnNewButton_3.setBounds(13, 56, 97, 23);
		userInfoDelete.add(btnNewButton_3);
		
		JPanel bookInfoUpdate = new JPanel();
		bookInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoUpdate.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookInfoUpdate);
		bookInfoUpdate.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("도서 정보 수정");
		lblNewLabel_9.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(0, 0, 434, 15);
		bookInfoUpdate.add(lblNewLabel_9);
		
		bookInfoUpdateID = new JTextField();
		bookInfoUpdateID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoUpdateID.setColumns(10);
		bookInfoUpdateID.setBounds(80, 39, 116, 21);
		bookInfoUpdate.add(bookInfoUpdateID);
		
		bookInfoUpdateTitle = new JTextField();
		bookInfoUpdateTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoUpdateTitle.setColumns(10);
		bookInfoUpdateTitle.setBounds(80, 68, 116, 21);
		bookInfoUpdate.add(bookInfoUpdateTitle);
		
		bookInfoUpdateISBN = new JTextField();
		bookInfoUpdateISBN.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoUpdateISBN.setColumns(10);
		bookInfoUpdateISBN.setBounds(80, 99, 116, 21);
		bookInfoUpdate.add(bookInfoUpdateISBN);
		
		JButton btnNewButton_2_1_1 = new JButton("수정");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				String queryString;
				
				try {
					queryString = "	UPDATE	BookInfo "
								+ " SET 	BookTitle = ?,"
								+ "			BookISBN = ?"
								+ "	WHERE	BookID = ?;";
				
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, bookInfoUpdateTitle.getText()));
					dataPack.add(new DataPack(2, bookInfoUpdateISBN.getText()));
					dataPack.add(new DataPack(3, bookInfoUpdateID.getText()));
					
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
		btnNewButton_2_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_2_1_1.setBounds(38, 143, 97, 23);
		bookInfoUpdate.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("ISBN");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(24, 102, 57, 15);
		bookInfoUpdate.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("제목");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(24, 71, 57, 15);
		bookInfoUpdate.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("ID");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(24, 42, 57, 15);
		bookInfoUpdate.add(lblNewLabel_2_2_1);
		
		JPanel bookInfoInsert = new JPanel();
		bookInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoInsert.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookInfoInsert);
		bookInfoInsert.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("도서 정보 등록");
		lblNewLabel_8.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(0, 0, 434, 15);
		bookInfoInsert.add(lblNewLabel_8);
		
		bookInfoInsertID = new JTextField();
		bookInfoInsertID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoInsertID.setColumns(10);
		bookInfoInsertID.setBounds(66, 32, 116, 21);
		bookInfoInsert.add(bookInfoInsertID);
		
		JLabel lblNewLabel_2_2 = new JLabel("ID");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 35, 57, 15);
		bookInfoInsert.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("제목");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(10, 64, 57, 15);
		bookInfoInsert.add(lblNewLabel_3_1);
		
		bookInfoInsertTitle = new JTextField();
		bookInfoInsertTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoInsertTitle.setColumns(10);
		bookInfoInsertTitle.setBounds(66, 61, 116, 21);
		bookInfoInsert.add(bookInfoInsertTitle);
		
		bookInfoInsertISBN = new JTextField();
		bookInfoInsertISBN.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoInsertISBN.setColumns(10);
		bookInfoInsertISBN.setBounds(66, 92, 116, 21);
		bookInfoInsert.add(bookInfoInsertISBN);
		
		JLabel lblNewLabel_4_1 = new JLabel("ISBN");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(10, 95, 57, 15);
		bookInfoInsert.add(lblNewLabel_4_1);
		
		JButton btnNewButton_2_1 = new JButton("등록");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				String queryString;

				try {
					queryString = "	INSERT INTO BookInfo"
								+ "	("
								+ "		BookID,"
								+ "		BookTitle,"
								+ " 	BookISBN"
								+ " )"
								+ " VALUES"
								+ " ("
								+ "		?,"
								+ "		?,"
								+ "		?"
								+ " );";
					
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, bookInfoInsertID.getText()));
					dataPack.add(new DataPack(2, bookInfoInsertTitle.getText()));
					dataPack.add(new DataPack(3, bookInfoInsertISBN.getText()));
					
					databaseAccessHelper.executeNonQuery(queryString, dataPack);
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
				} finally {
					if (databaseAccessHelper != null) {
						databaseAccessHelper.Close();
					}
				}
				
			}
		});
		btnNewButton_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(24, 136, 97, 23);
		bookInfoInsert.add(btnNewButton_2_1);
		
		JPanel userInfoInsert = new JPanel();
		userInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoInsert.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoInsert);
		userInfoInsert.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("사용자 정보 등록");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(0, 0, 434, 15);
		userInfoInsert.add(lblNewLabel_1);
		
		userInfoInsertID = new JTextField();
		userInfoInsertID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoInsertID.setBounds(68, 40, 116, 21);
		userInfoInsert.add(userInfoInsertID);
		userInfoInsertID.setColumns(10);
		
		userInfoInsertName = new JTextField();
		userInfoInsertName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoInsertName.setBounds(68, 69, 116, 21);
		userInfoInsert.add(userInfoInsertName);
		userInfoInsertName.setColumns(10);
		
		userInfoInsertPhoneNum = new JTextField();
		userInfoInsertPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
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
		
		JButton btnNewButton_2 = new JButton("등록");
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
		btnNewButton_2.setBounds(26, 144, 97, 23);
		userInfoInsert.add(btnNewButton_2);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mainPanel.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("도서 대여 관리 프로그램");
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(0, 0, 434, 238);
		mainPanel.add(lblNewLabel_7);
		
		JPanel userInfoUpdate = new JPanel();
		userInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoUpdate.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoUpdate);
		userInfoUpdate.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("사용자 정보 수정");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(0, 0, 434, 15);
		userInfoUpdate.add(lblNewLabel_5);
		
		userInfoUpdateID = new JTextField();
		userInfoUpdateID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoUpdateID.setBounds(84, 40, 116, 21);
		userInfoUpdate.add(userInfoUpdateID);
		userInfoUpdateID.setColumns(10);
		
		userInfoUpdateName = new JTextField();
		userInfoUpdateName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoUpdateName.setBounds(84, 71, 116, 21);
		userInfoUpdate.add(userInfoUpdateName);
		userInfoUpdateName.setColumns(10);
		
		userInfoUpdatePhoneNum = new JTextField();
		userInfoUpdatePhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoUpdatePhoneNum.setBounds(84, 101, 116, 21);
		userInfoUpdate.add(userInfoUpdatePhoneNum);
		userInfoUpdatePhoneNum.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("ID");
		lblNewLabel_16.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_16.setBounds(15, 43, 57, 15);
		userInfoUpdate.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("이름");
		lblNewLabel_17.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_17.setBounds(15, 74, 57, 15);
		userInfoUpdate.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("전화번호");
		lblNewLabel_18.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_18.setBounds(15, 104, 57, 15);
		userInfoUpdate.add(lblNewLabel_18);
		
		JButton btnNewButton_4 = new JButton("수정");
		btnNewButton_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
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
		btnNewButton_4.setBounds(15, 149, 97, 23);
		userInfoUpdate.add(btnNewButton_4);
		
		JPanel bookInfoSelect = new JPanel();
		bookInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoSelect.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookInfoSelect);
		bookInfoSelect.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("도서 정보 조회");
		lblNewLabel_11.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(0, 0, 434, 15);
		bookInfoSelect.add(lblNewLabel_11);
		
		JButton btnNewButton_5 = new JButton("조회");
		btnNewButton_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				ResultSet resultSet = null;
				String queryString;
				
				try {
					
					queryString = "	SELECT	BookID,"
								+ "			BookTitle,"
								+ "			BookISBN "
								+ "	FROM 	BookInfo"
								+ "	WHERE	BookID = ?";
				
					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
					dataPack.add(new DataPack(1, bookInfoSelectID.getText()));
					resultSet = databaseAccessHelper.executeQuery(queryString, dataPack);
					bookInfoTableModel.setNumRows(0);
					while(resultSet.next() ) {
						bookInfoTableModel.addRow(new Object[]{
													resultSet.getString("BookID"), 
													resultSet.getString("BookTitle"),
													resultSet.getString("BookISBN")
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
		btnNewButton_5.setBounds(0, 215, 97, 23);
		bookInfoSelect.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("전체 조회");
		btnNewButton_6.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
				ResultSet resultSet = null;
				String queryString;
				
				try {
					
					queryString = "	SELECT	bookID,"
								+ "			bookTitle,"
								+ "			bookISBN "
								+ "	FROM 	bookInfo";
				
					resultSet = databaseAccessHelper.executeQuery(queryString);
					bookInfoTableModel.setNumRows(0);
					while(resultSet.next() ) {
						bookInfoTableModel.addRow(new Object[]{
													resultSet.getString("bookID"), 
													resultSet.getString("bookTitle"),
													resultSet.getString("bookISBN")
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
		btnNewButton_6.setBounds(114, 215, 97, 23);
		bookInfoSelect.add(btnNewButton_6);
		
		bookInfoSelectID = new JTextField();
		bookInfoSelectID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoSelectID.setBounds(57, 25, 116, 21);
		bookInfoSelect.add(bookInfoSelectID);
		bookInfoSelectID.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("ID");
		lblNewLabel_19.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_19.setBounds(10, 28, 57, 15);
		bookInfoSelect.add(lblNewLabel_19);
		
		bookInfoTable = new JTable(bookInfoTableModel);
		bookInfoTable.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoTable.setBounds(10, 50, 410, 155);
		
		JScrollPane bookInfoScrollPane = new JScrollPane(bookInfoTable);
		bookInfoScrollPane.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInfoScrollPane.setBounds(10,50,410,155);
		bookInfoSelect.add(bookInfoScrollPane);
		
		JPanel userInfoSelect = new JPanel();
		userInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoSelect.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(userInfoSelect);
		userInfoSelect.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("사용자 정보 조회");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(0, 0, 434, 15);
		userInfoSelect.add(lblNewLabel_6);
		
		userInfoTable = new JTable(userInfoTableModel);
		userInfoTable.setToolTipText("");
		userInfoTable.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoTable.setBounds(10, 50, 410, 155);
		//userInfoSelect.add(userInfoTable);
		
		
		JScrollPane userInfoScrollPane = new JScrollPane(userInfoTable);
		userInfoScrollPane.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoScrollPane.setBounds(10,50,410,155);
		userInfoSelect.add(userInfoScrollPane);
		
		userInfoSelectID = new JTextField();
		userInfoSelectID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userInfoSelectID.setBounds(62, 19, 116, 21);
		userInfoSelect.add(userInfoSelectID);
		userInfoSelectID.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("ID");
		lblNewLabel_15.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(10, 25, 57, 15);
		userInfoSelect.add(lblNewLabel_15);
		
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
					dataPack.add(new DataPack(1, userInfoSelectID.getText()));
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
		btnNewButton.setBounds(0, 215, 97, 23);
		userInfoSelect.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(106, 215, 97, 23);
		userInfoSelect.add(btnNewButton_1);
		
		JPanel bookInOutSelect = new JPanel();
		bookInOutSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInOutSelect.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookInOutSelect);
		bookInOutSelect.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("도서 대여 이력 조회");
		lblNewLabel_14.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(0, 0, 434, 15);
		bookInOutSelect.add(lblNewLabel_14);
		
		JPanel bookInInsert = new JPanel();
		bookInInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bookInInsert.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(bookInInsert);
		bookInInsert.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("도서 반입 등록");
		lblNewLabel_13.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(0, 0, 434, 15);
		bookInInsert.add(lblNewLabel_13);
		
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
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("홈");
		mntmNewMenuItem_12.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(true);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_12);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("사용자 정보 관리");
		mnNewMenu_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("사용자 정보 등록");
		mntmNewMenuItem_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(true);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("사용자 정보 삭제");
		mntmNewMenuItem_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(true);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("사용자 정보 수정");
		mntmNewMenuItem_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(true);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("사용자 정보 조회");
		mntmNewMenuItem_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(true);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
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
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(true);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("도서 정보 삭제");
		mntmNewMenuItem_7.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(true);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("도서 정보 수정");
		mntmNewMenuItem_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(true);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("도서 정보 조회");
		mntmNewMenuItem_8.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(true);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
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
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(true);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("도서 반입 등록");
		mntmNewMenuItem_10.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(true);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("도서 대여 이력 조회");
		mntmNewMenuItem_11.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_4 = new JMenu("도움말");
		mnNewMenu_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_4);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				mainPanel.setVisible(true);
				//사용자 정보 관리 패널 세팅
				userInfoInsert.setVisible(false);
				userInfoDelete.setVisible(false);
				userInfoSelect.setVisible(false);
				userInfoUpdate.setVisible(false);
				//도서 정보 관리 패널 세팅
				bookInfoInsert.setVisible(false);
				bookInfoDelete.setVisible(false);
				bookInfoSelect.setVisible(false);
				bookInfoUpdate.setVisible(false);
				//도서 대여 관리 패널 세팅
				bookInInsert.setVisible(false);
				bookOutInsert.setVisible(false);
				bookInOutSelect.setVisible(false);
			}
		});
	}
}
