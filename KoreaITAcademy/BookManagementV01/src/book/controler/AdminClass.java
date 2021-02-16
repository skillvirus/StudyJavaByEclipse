package book.controler;

import book.model.*;

public class AdminClass {

	DataClass dataClass = new DataClass();
	
	public AdminClass() {
	}
	
	public void insertBookInfo(BookClass bookClass) {
		dataClass.insertData(bookClass);
	}
	
	public void selectBookInfo() {
		dataClass.selectData();
	}
}
