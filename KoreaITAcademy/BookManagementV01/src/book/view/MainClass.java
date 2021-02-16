package book.view;

import java.util.Scanner;
import book.controler.*;

public class MainClass {

	public static void main(String[] args) {

		Scanner inputSC = new Scanner(System.in);

		BookClass bookClass = new BookClass();
		AdminClass adminClass = new AdminClass();
		
		System.out.print("책 번호를 입력하세요 : ");
		bookClass.setBookNo(inputSC.next());
		
		System.out.print("책 제목을 입력하세요 : ");
		bookClass.setBookTitle(inputSC.next());
		
		adminClass.insertBookInfo(bookClass);
		
//		BookClass bookClass2 = new BookClass();
//		System.out.print("책 번호를 입력하세요 : ");
//		bookNo = inputSC.next();
//		bookClass2.setBookNo(bookNo);
//		System.out.print("책 제목을 입력하세요 : ");
//		bookTitle = inputSC.next();
//		bookClass2.setBookTitle(bookTitle);
//		adminClass.insertBookInfo(bookClass2);
//		
//		BookClass bookClass3 = new BookClass();
//		System.out.print("책 번호를 입력하세요 : ");
//		bookNo = inputSC.next();
//		bookClass3.setBookNo(bookNo);
//		System.out.print("책 제목을 입력하세요 : ");
//		bookTitle = inputSC.next();
//		bookClass3.setBookTitle(bookTitle);
//		adminClass.insertBookInfo(bookClass3);
//		
//		
		adminClass.selectBookInfo();
		
		inputSC.close();
	}

}
