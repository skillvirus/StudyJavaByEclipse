package controler;

import model.*;

public class UserAdmin {

	DataHelper dataHelper = new DataHelper();
	
	public UserAdmin() {
	}
	
	public void insertBookInfo(Book book) {
		dataHelper.insertData(book);
	}
	
//	public void selectBookInfo() {
//		dataHelper.selectData();
//	}
}
