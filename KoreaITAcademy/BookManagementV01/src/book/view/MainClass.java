package book.view;

import java.util.Scanner;
import book.controler.*;

public class MainClass {

	public static void main(String[] args) {

		String bookNo;
		String bookTitle;
		
		Scanner inputSC = new Scanner(System.in);

		AdminClass adminClass = new AdminClass();
		
		BookClass bookClass1 = new BookClass();
		System.out.print("책 번호를 입력하세요 : ");
		bookNo = inputSC.next();
		bookClass1.setBookNo(bookNo);
		System.out.print("책 제목을 입력하세요 : ");
		bookTitle = inputSC.next();
		bookClass1.setBookTitle(bookTitle);
		adminClass.insertBookInfo(bookClass1);
		
		BookClass bookClass2 = new BookClass();
		System.out.print("책 번호를 입력하세요 : ");
		bookNo = inputSC.next();
		bookClass2.setBookNo(bookNo);
		System.out.print("책 제목을 입력하세요 : ");
		bookTitle = inputSC.next();
		bookClass2.setBookTitle(bookTitle);
		adminClass.insertBookInfo(bookClass2);
		
		BookClass bookClass3 = new BookClass();
		System.out.print("책 번호를 입력하세요 : ");
		bookNo = inputSC.next();
		bookClass3.setBookNo(bookNo);
		System.out.print("책 제목을 입력하세요 : ");
		bookTitle = inputSC.next();
		bookClass3.setBookTitle(bookTitle);
		adminClass.insertBookInfo(bookClass3);
		
		
		adminClass.selectBookInfo();
		
		inputSC.close();
	}

}
