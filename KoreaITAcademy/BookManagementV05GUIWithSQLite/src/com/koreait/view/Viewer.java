package com.koreait.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

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

import com.koreait.controller.Manager;
import com.koreait.model.UserInfo;

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
	private JTextField txfUserInfoInsertID;
	private JTextField txfUserInfoInsertName;
	private JTextField txfUserInfoInsertPhoneNum;
	private JLabel lblUserInfoInsertID;
	private JLabel lblUserInfoInsertName;
	private JLabel lblUserInfoInsertPhoneNum;
	private JButton btnUserInfoInsert;
	private JTextField txfUserInfoDeleteID;
	private JLabel lblUserInfoDeleteID;
	private JButton btnUserInfoDelete;
	private JScrollPane scrpUserInfo;
	private JTable tblUserInfo;
	private DefaultTableModel tblUserInfoTableModel;
	private JButton btnUserInfoSelect;
	private JTextField txfUserInfoSelectID;
	private JTextField txfUserInfoSelectName;
	private JTextField txfUserInfoSelectPhoneNum;
	private JTextField txfUserInfoUpdateID;
	private JTextField txfUserInfoUpdateName;
	private JTextField txfUserInfoUpdatePhoneNum;
	private JLabel lblUserInfoUpdateID;
	private JLabel lblUserInfoUpdatePhoneNum;
	private JLabel lblUserInfoUpdateName;
	private JButton btnUserInfoUpdate;
	
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
		frmMain.setLocationRelativeTo(null); //화면 중앙에서 열림
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		frmMain.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setPanelVisible("pnlMain");
			}
		});
		
		pnlUserInfoUpdate = new JPanel();
		pnlUserInfoUpdate.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoUpdate);
		pnlUserInfoUpdate.setLayout(null);
		
		lblUserInfoUpdatePnlTitle = new JLabel("[사용자 정보 수정]");
		lblUserInfoUpdatePnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoUpdatePnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdatePnlTitle);
		
		lblUserInfoUpdateID = new JLabel("ID");
		lblUserInfoUpdateID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoUpdateID.setBounds(10, 54, 57, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdateID);
		
		txfUserInfoUpdateID = new JTextField();
		txfUserInfoUpdateID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoUpdateID.setColumns(10);
		txfUserInfoUpdateID.setBounds(81, 51, 116, 21);
		pnlUserInfoUpdate.add(txfUserInfoUpdateID);
		
		txfUserInfoUpdateName = new JTextField();
		txfUserInfoUpdateName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoUpdateName.setColumns(10);
		txfUserInfoUpdateName.setBounds(81, 79, 116, 21);
		pnlUserInfoUpdate.add(txfUserInfoUpdateName);
		
		txfUserInfoUpdatePhoneNum = new JTextField();
		txfUserInfoUpdatePhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoUpdatePhoneNum.setColumns(10);
		txfUserInfoUpdatePhoneNum.setBounds(81, 107, 116, 21);
		pnlUserInfoUpdate.add(txfUserInfoUpdatePhoneNum);
		
		lblUserInfoUpdatePhoneNum = new JLabel("전화번호");
		lblUserInfoUpdatePhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoUpdatePhoneNum.setBounds(10, 110, 57, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdatePhoneNum);
		
		lblUserInfoUpdateName = new JLabel("이름");
		lblUserInfoUpdateName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoUpdateName.setBounds(10, 82, 57, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdateName);
		
		btnUserInfoUpdate = new JButton("수정");
		btnUserInfoUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo userInfo = new UserInfo(); //정보를 담아놓을 객체(Model 영역)
				Manager manager = new Manager(); //정보를 직접 처리(등록,수정,삭제, 조회)할 객체(Controller 영역)
				boolean result = false;
				
				try {
					userInfo.setUserID(txfUserInfoUpdateID.getText());
					userInfo.setUserName(txfUserInfoUpdateName.getText());
					userInfo.setUserPhoneNum(txfUserInfoUpdatePhoneNum.getText());
					
					if (Tools.openAlert("수정하시겠습니까?") == 0) {
						result = manager.updateUserInfo(userInfo);
						
						if (result == true) {
							Tools.setText(lblResultInfo, "수정 완료", 3, Tools.messageType.SUCCESS);
						} else {
							Tools.setText(lblResultInfo, "오류 발생", 3, Tools.messageType.ERROR);
						}
					}
				} catch(Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();
				}
			}
		});
		btnUserInfoUpdate.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnUserInfoUpdate.setBounds(10, 302, 97, 23);
		pnlUserInfoUpdate.add(btnUserInfoUpdate);
		
		pnlUserInfoInsert = new JPanel();
		pnlUserInfoInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoInsert);
		pnlUserInfoInsert.setLayout(null);
		
		lblUserInfoInsertPnlTitle = new JLabel("[사용자 정보 등록]");
		lblUserInfoInsertPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertPnlTitle);
		
		lblUserInfoInsertID = new JLabel("ID");
		lblUserInfoInsertID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoInsertID.setBounds(10, 54, 57, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertID);
		
		txfUserInfoInsertID = new JTextField();
		txfUserInfoInsertID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoInsertID.setBounds(81, 51, 116, 21);
		pnlUserInfoInsert.add(txfUserInfoInsertID);
		txfUserInfoInsertID.setColumns(10);
		
		lblUserInfoInsertName = new JLabel("이름");
		lblUserInfoInsertName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoInsertName.setBounds(10, 82, 57, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertName);
		
		txfUserInfoInsertName = new JTextField();
		txfUserInfoInsertName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoInsertName.setColumns(10);
		txfUserInfoInsertName.setBounds(81, 79, 116, 21);
		pnlUserInfoInsert.add(txfUserInfoInsertName);
		
		lblUserInfoInsertPhoneNum = new JLabel("전화번호");
		lblUserInfoInsertPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoInsertPhoneNum.setBounds(10, 110, 57, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertPhoneNum);
		
		txfUserInfoInsertPhoneNum = new JTextField();
		txfUserInfoInsertPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoInsertPhoneNum.setColumns(10);
		txfUserInfoInsertPhoneNum.setBounds(81, 107, 116, 21);
		pnlUserInfoInsert.add(txfUserInfoInsertPhoneNum);
		
		//사용자 정보 등록
		btnUserInfoInsert = new JButton("등록");
		btnUserInfoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				//1단계 : MVC 패턴 없이 구현_S
//				//1. DB 연결
//				//2. DB에 전달할 정보 지정
//				//3. 쿼리 생성
//				//4. 쿼리 실행
//				Connection connection = null; //데이터베이스 연결된 상태(세션)를 저장하는 객체
//				PreparedStatement preparedStatement = null; //SQL문을 나타내는 객체
//				String queryString;
//				
//				try {
//					queryString = "	INSERT INTO UserInfo"
//					+ "	("
//					+ "		UserID,"
//					+ "		UserName,"
//					+ " 	UserPhoneNum"
//					+ " )"
//					+ " VALUES"
//					+ " ("
//					+ "		?,"
//					+ "		?,"
//					+ "		?"
//					+ " );";
//					
//					Class.forName("org.sqlite.JDBC");
//					connection = DriverManager.getConnection("jdbc:sqlite:./././Resources/Database/BookManagement.db");
//					preparedStatement = connection.prepareStatement(queryString);
//					
////					preparedStatement.setString(1, "16");
////					preparedStatement.setString(2, "사용자16");
////					preparedStatement.setString(3, "010-0000-0016");
//					
//					//화면에서 입력받은 정보를 전달
//					preparedStatement.setString(1, txfUserInfoInsertID.getText());
//					preparedStatement.setString(2, txfUserInfoInsertName.getText());
//					preparedStatement.setString(3, txfUserInfoInsertPhoneNum.getText());
//					
//					preparedStatement.executeUpdate();
//							
//					connection.close();
//					
//				} catch (Exception ex) {
//					lblResultInfo.setText(ex.getMessage());
//				}
//				//1단계 : MVC 패턴 없이 구현_E
				
//				//2단계 : DAO 객체를 사용(MVC 미사용)_S
//				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
//				String queryString;
//
//				try {
//					queryString = "	INSERT INTO UserInfo"
//								+ "	("
//								+ "		UserID,"
//								+ "		UserName,"
//								+ " 	UserPhoneNum"
//								+ " )"
//								+ " VALUES"
//								+ " ("
//								+ "		?,"
//								+ "		?,"
//								+ "		?"
//								+ " );";
//					
//					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
//					dataPack.add(new DataPack(1, txfUserInfoInsertID.getText()));
//					dataPack.add(new DataPack(2, txfUserInfoInsertName.getText()));
//					dataPack.add(new DataPack(3, txfUserInfoInsertPhoneNum.getText()));
//					
//					databaseAccessHelper.executeNonQuery(queryString, dataPack);
//				} catch(Exception ex) {
//					System.out.println(ex.getMessage());
//				} finally {
//					if (databaseAccessHelper != null) {
//						databaseAccessHelper.close();
//					}
//				}
//				//2단계 : DAO 객체를 사용(MVC 미사용)_E
				
				//3단계 : MVC 패턴 사용_S
				UserInfo userInfo = new UserInfo(); //정보를 담아놓을 객체(Model 영역)
				Manager manager = new Manager(); //정보를 직접 처리(등록,수정,삭제, 조회)할 객체(Controller 영역)
				boolean result = false;;
				
				try {
					userInfo.setUserID(txfUserInfoInsertID.getText());
					userInfo.setUserName(txfUserInfoInsertName.getText());
					userInfo.setUserPhoneNum(txfUserInfoInsertPhoneNum.getText());
					
					result = manager.inserUserInfo(userInfo);
					
					if (result == true) {
						Tools.setText(lblResultInfo, "등록 완료", 3, Tools.messageType.SUCCESS);
					} else {
						Tools.setText(lblResultInfo, "오류 발생", 3, Tools.messageType.ERROR);
					}
				} catch(Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();
				}
				//3단계 : MVC 패턴 사용_E
			}
		});
		btnUserInfoInsert.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnUserInfoInsert.setBounds(10, 302, 97, 23);
		pnlUserInfoInsert.add(btnUserInfoInsert);
		
		pnlUserInfoSelect = new JPanel();
		pnlUserInfoSelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoSelect);
		pnlUserInfoSelect.setLayout(null);
		
		lblUserInfoSelectPnlTitle = new JLabel("[사용자 정보 조회]");
		lblUserInfoSelectPnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoSelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectPnlTitle);
		
		String[] tblUserInfoColName = {"사용자ID", "사용자성명", "사용자전화번호"};
		tblUserInfoTableModel = new DefaultTableModel(tblUserInfoColName, 0);
		
		tblUserInfo = new JTable(tblUserInfoTableModel);
		tblUserInfo.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tblUserInfo.setBounds(10, 50, 410, 155);
		
		scrpUserInfo = new JScrollPane(tblUserInfo);
		scrpUserInfo.setBounds(10, 50, 612, 242);
		pnlUserInfoSelect.add(scrpUserInfo);
		
		btnUserInfoSelect = new JButton("조회");
		btnUserInfoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo userInfo = new UserInfo(); //정보를 담아놓을 객체(Model 영역)
				Manager manager = new Manager(); //정보를 직접 처리(등록,수정,삭제, 조회)할 객체(Controller 영역)
				ResultSet resultSet = null;
				
				try
				{
					userInfo.setUserID(txfUserInfoSelectID.getText());
					userInfo.setUserName(txfUserInfoSelectName.getText());
					userInfo.setUserPhoneNum(txfUserInfoSelectPhoneNum.getText());
					resultSet = manager.selectUserInfo(userInfo);
					
					tblUserInfoTableModel.setNumRows(0);
					try {
						while(resultSet.next() ) {
							tblUserInfoTableModel.addRow(new Object[]{
														resultSet.getString("UserID"), 
														resultSet.getString("UserName"),
														resultSet.getString("UserPhoneNum")
													 });
						}
						
						Tools.setText(lblResultInfo, "조회 완료", 3, Tools.messageType.SUCCESS);
					} catch (SQLException e1) {
						Tools.setText(lblResultInfo, e1.getMessage(), 3, Tools.messageType.ERROR);
					} finally {
						if (resultSet != null) {
							try {
								resultSet.close();
							} catch (SQLException e1) {
								Tools.setText(lblResultInfo, e1.getMessage(), 3, Tools.messageType.ERROR);
							}
						}
					}
				} catch (Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();
					manager.closeResultSet();
				}
			}
		});
		btnUserInfoSelect.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnUserInfoSelect.setBounds(10, 302, 97, 23);
		pnlUserInfoSelect.add(btnUserInfoSelect);
		
		JLabel lblUserInfoSelectID = new JLabel("ID");
		lblUserInfoSelectID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoSelectID.setBounds(10, 30, 57, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectID);
		
		txfUserInfoSelectID = new JTextField();
		txfUserInfoSelectID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoSelectID.setBounds(80, 27, 97, 21);
		pnlUserInfoSelect.add(txfUserInfoSelectID);
		txfUserInfoSelectID.setColumns(10);
		
		txfUserInfoSelectName = new JTextField();
		txfUserInfoSelectName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoSelectName.setColumns(10);
		txfUserInfoSelectName.setBounds(256, 27, 97, 21);
		pnlUserInfoSelect.add(txfUserInfoSelectName);
		
		JLabel lblUserInfoSelectName = new JLabel("이름");
		lblUserInfoSelectName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoSelectName.setBounds(186, 30, 57, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectName);
		
		txfUserInfoSelectPhoneNum = new JTextField();
		txfUserInfoSelectPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoSelectPhoneNum.setColumns(10);
		txfUserInfoSelectPhoneNum.setBounds(435, 27, 187, 21);
		pnlUserInfoSelect.add(txfUserInfoSelectPhoneNum);
		
		JLabel lblUserInfoSelectPhoneNum = new JLabel("전화번호");
		lblUserInfoSelectPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoSelectPhoneNum.setBounds(365, 30, 57, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectPhoneNum);
						
		pnlUserInfoDelete = new JPanel();
		pnlUserInfoDelete.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoDelete);
		pnlUserInfoDelete.setLayout(null);
		
		lblUserInfoDeletePnlTitle = new JLabel("[사용자 정보 삭제]");
		lblUserInfoDeletePnlTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoDeletePnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoDelete.add(lblUserInfoDeletePnlTitle);
		
		lblUserInfoDeleteID = new JLabel("ID");
		lblUserInfoDeleteID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblUserInfoDeleteID.setBounds(10, 54, 57, 15);
		pnlUserInfoDelete.add(lblUserInfoDeleteID);
		
		txfUserInfoDeleteID = new JTextField();
		txfUserInfoDeleteID.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txfUserInfoDeleteID.setColumns(10);
		txfUserInfoDeleteID.setBounds(81, 51, 116, 21);
		pnlUserInfoDelete.add(txfUserInfoDeleteID);
		
		btnUserInfoDelete = new JButton("삭제");
		btnUserInfoDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				//1단계 : MVC 패턴 없이 구현_S
//				//1. DB 연결
//				//2. DB에 전달할 정보 지정
//				//3. 쿼리 생성
//				//4. 쿼리 실행
//				Connection connection = null; //데이터베이스 연결된 상태(세션)를 저장하는 객체
//				PreparedStatement preparedStatement = null; //SQL문을 나타내는 객체
//				String queryString;
//				
//				try {
//					queryString = "	DELETE"
//								+ "	FROM UserInfo"
//								+ "	WHERE UserID = ?";
//					
//					Class.forName("org.sqlite.JDBC");
//					connection = DriverManager.getConnection("jdbc:sqlite:./././Resources/Database/BookManagement.db");
//					preparedStatement = connection.prepareStatement(queryString);
//					
//					//화면에서 입력받은 정보를 전달
//					preparedStatement.setString(1, txfUserInfoDeleteID.getText());
//					
//					preparedStatement.executeUpdate();
//							
//					connection.close();
//					
//				} catch (Exception ex) {
//					lblResultInfo.setText(ex.getMessage());
//				}
//				//1단계 : MVC 패턴 없이 구현_E
				
//				//2단계 : DAO 객체를 사용(MVC 미사용)_S
//				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
//				String queryString;
//
//				try {
//					queryString = "	DELETE"
//								+ "	FROM UserInfo"
//								+ "	WHERE UserID = ?";
//					
//					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
//					dataPack.add(new DataPack(1, txfUserInfoDeleteID.getText()));
//					
//					databaseAccessHelper.executeNonQuery(queryString, dataPack);
//				} catch(Exception ex) {
//					System.out.println(ex.getMessage());
//				} finally {
//					if (databaseAccessHelper != null) {
//						databaseAccessHelper.close();
//					}
//				}
				//2단계 : DAO 객체를 사용(MVC 미사용)_E
				
				//3단계 : MVC 패턴 사용_S
				UserInfo userInfo = new UserInfo(); //정보를 담아놓을 객체(Model 영역)
				Manager manager = new Manager(); //정보를 직접 처리(등록,수정,삭제, 조회)할 객체(Controller 영역)
				boolean result = false;
				
				try {
					userInfo.setUserID(txfUserInfoDeleteID.getText());
					
					if (Tools.openAlert("삭제하시겠습니까?") == 0) {
						result = manager.deleteUserInfo(userInfo);
						
						if (result == true) {
							Tools.setText(lblResultInfo, "삭제 완료", 3, Tools.messageType.SUCCESS);
						} else {
							Tools.setText(lblResultInfo, "오류 발생", 3, Tools.messageType.ERROR);
						}
					}
				} catch(Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();	
				}
				//3단계 : MVC 패턴 사용_E
			}
		});
		btnUserInfoDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnUserInfoDelete.setBounds(10, 302, 97, 23);
		pnlUserInfoDelete.add(btnUserInfoDelete);
		
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
			Class<?> c = Class.forName("com.koreait.view.Viewer");
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
