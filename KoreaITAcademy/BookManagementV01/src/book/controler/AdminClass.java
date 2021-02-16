package book.controler;

import book.model.*;

public class AdminClass {

	DataClass dataClass = new DataClass();
	
	public AdminClass() {
	}
	
	public AdminClass(DataClass dataClass) {
		this.dataClass = dataClass;
	}
	
	public void insertBookInfo(BookClass bookClass) {
		this.dataClass.insertData(bookClass);
	}
	
	public void selectBookInfo() {
		this.dataClass.selectData();
	}
}
