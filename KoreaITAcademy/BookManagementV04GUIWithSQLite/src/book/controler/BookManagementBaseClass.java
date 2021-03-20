package book.controler;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import book.model.DataPack;
import book.model.DatabaseAccessHelper;

public class BookManagementBaseClass {

	//등록
	public void insertData(String queryString, ArrayList<DataPack> parameters) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		
		try {
			databaseAccessHelper.executeNonQuery(queryString, parameters);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (databaseAccessHelper != null) {
				databaseAccessHelper.Close();
			}
		}
	}
	
	//수정
	public void updateData(String queryString, ArrayList<DataPack> parameters) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		
		try {
			databaseAccessHelper.executeNonQuery(queryString, parameters);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (databaseAccessHelper != null) {
				databaseAccessHelper.Close();
			}
		}
	}
	
	//삭제
	public void deleteData(String queryString, ArrayList<DataPack> parameters) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		
		try {
			databaseAccessHelper.executeNonQuery(queryString, parameters);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (databaseAccessHelper != null) {
				databaseAccessHelper.Close();
			}
		}
	}
	
	//전체조회(Table)
	public void selectData(String queryString, DefaultTableModel tableModel) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		
		try {
			resultSet = databaseAccessHelper.executeQuery(queryString);
			ResultSetMetaData rsmd = resultSet.getMetaData(); 
			int columnCount = rsmd.getColumnCount();
			tableModel.setNumRows(0);
			while(resultSet.next()) {
				Vector<String> result = new Vector<String>();
				for (int i = 1; i <= columnCount; i++) {
					result.add(resultSet.getString(i));
				}
				tableModel.addRow(result);
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
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	//조건조회(Table)
	public void selectData(String queryString, DefaultTableModel tableModel, ArrayList<DataPack> parameters) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		
		try {
			resultSet = databaseAccessHelper.executeQuery(queryString, parameters);
			ResultSetMetaData rsmd = resultSet.getMetaData(); 
			int columnCount = rsmd.getColumnCount();
			tableModel.setNumRows(0);
			while(resultSet.next()) {
				Vector<String> result = new Vector<String>();
				for (int i = 1; i <= columnCount; i++) {
					result.add(resultSet.getString(i));
				}
				tableModel.addRow(result);
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
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	//조건조회(TextField)
	public void selectData(String queryString, JTextField tableModel, ArrayList<DataPack> parameters) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		
		try {
			resultSet = databaseAccessHelper.executeQuery(queryString, parameters);
			tableModel.setText(resultSet.getString(1));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (databaseAccessHelper != null) {
				databaseAccessHelper.Close();
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	//조건조회(TextField, index)
	public void selectData(String queryString, JTextField tableModel, ArrayList<DataPack> parameters, int index) {
		DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
		ResultSet resultSet = null;
		
		try {
			resultSet = databaseAccessHelper.executeQuery(queryString, parameters);
			tableModel.setText(resultSet.getString(index));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (databaseAccessHelper != null) {
				databaseAccessHelper.Close();
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
