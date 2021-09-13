package com.koreait.view;
import java.util.Scanner;

import com.koreait.model.Book;
import com.koreait.model.BookInOut;
import com.koreait.model.User;

public class Viewer {

	private Scanner inputSC = new Scanner(System.in);
	private int inputNum;
	
	/*
	 * 메뉴시작(외부 클래스 노출)
	 */
	public void start() {
		this.showMain();
	}
	
	/*
	 * 메인메뉴
	 */
	private void showMain() {
		System.out.println();
		System.out.println("=========도서대여 관리 프로그램=========");
		System.out.println("[1] 사용자 정보 관리");
		System.out.println("[2] 도서 정보 관리");
		System.out.println("[3] 도서 대여 관리");
		System.out.println("[0] 프로그램 종료");
		System.out.println("========================================");
		System.out.print("실행할 메뉴의 번호를 입력하세요 : ");
		
		inputNum = inputSC.nextInt();
		
		if (inputNum == 1) {
			this.showUserInfoManagement();
		} else if (inputNum == 2) {
			this.showBookInfoManagement();
		} else if (inputNum == 3) {
			this.showBookInOutManagement();
		} else if (inputNum == 0) {
			this.end();
		}		
	}
	
	//Level1 Menu(도서대여점 관리 프로그램) Start
	/*
	 * 사용자 정보 관리
	 */
	private void showUserInfoManagement() {
		System.out.println();
		System.out.println("==========사용자 정보 관리==========");
		System.out.println("[1] 사용자 정보 등록");
		System.out.println("[2] 사용자 정보 삭제");
		System.out.println("[3] 사용자 정보 수정");
		System.out.println("[4] 사용자 정보 조회");
		System.out.println("[9] 이전화면");
		System.out.println("[0] 프로그램 종료");
		System.out.println("========================================");
		System.out.print("실행할 메뉴의 번호를 입력하세요 : ");
		
		inputNum = inputSC.nextInt();
		
		if (inputNum == 1) { //사용자 정보 등록
			this.showUserInfoInsert();
		} else if (inputNum == 2) { //사용자 정보 삭제
			this.showUserInfoDelete();
		} else if (inputNum == 3) { //사용자 정보 수정
			this.showUserInfoUpdate();
		} else if (inputNum == 4) { //사용자 정보 조회
			this.showUserInfoSelect();
		} else if (inputNum == 9) { //이전화면
			this.showMain();
		} else if (inputNum == 0) { //프로그램 종료
			this.end();
		}
	}
	
	/*
	 * 도서 정보 관리
	 */
	private void showBookInfoManagement() {
		System.out.println();
		System.out.println("==========도서 정보 관리==========");
		System.out.println("[1] 도서 정보 등록");
		System.out.println("[2] 도서 정보 삭제");
		System.out.println("[3] 도서 정보 수정");
		System.out.println("[4] 도서 정보 조회");
		System.out.println("[9] 이전화면");
		System.out.println("[0] 프로그램 종료");
		System.out.println("========================================");
		System.out.print("실행할 메뉴의 번호를 입력하세요 : ");
		
		inputNum = inputSC.nextInt();
		
		if (inputNum == 1) { //도서 정보 등록
			this.showBookInfoInsert();
		} else if (inputNum == 2) { //도서 정보 삭제
			this.showBookInfoDelete();
 		} else if (inputNum == 3) { //도서 정보 수정
			this.showBookInfoUpdate();
		} else if (inputNum == 4) { //도서 정보 조회
			this.showBookInfoSelect();
		} else if (inputNum == 9) {
			this.showMain();
		} else if (inputNum == 0) {
			this.end();
		}
	}
	
	/*
	 * 도서 대여 관리
	 */
	private void showBookInOutManagement() {
		System.out.println();
		System.out.println("==========도서 대여 관리==========");
		System.out.println("[1] 도서 반출 등록");
		System.out.println("[2] 도서 반입 등록");
		System.out.println("[3] 도서 대여 이력 조회");
		System.out.println("[9] 이전화면");
		System.out.println("[0] 프로그램 종료");
		System.out.println("========================================");
		System.out.print("실행할 메뉴의 번호를 입력하세요 : ");
		
		inputNum = inputSC.nextInt();
		
		if (inputNum == 1) {
			this.showInOutInfoOutgoing();
		} else if (inputNum == 2) {
			this.showInOutInfoIncoming();
		} else if (inputNum == 3) {
			this.showInOutInfoSelect();
		} else if (inputNum == 9) {
			this.showMain();
		} else if (inputNum == 0) {
			this.end();
		}
	}
	//Level1 Menu(도서대여점 관리 프로그램) End
	
	//Level2-1 Menu(사용자 정보 관리) Start
	/*
	 * 사용자 정보 등록 
	 */
	private void showUserInfoInsert() {
		User user = new User();
		
		System.out.println();
		System.out.println("==========사용자 정보 등록==========");
		System.out.print("사용자 아이디를 입력하세요 : ");
		user.setUserID(inputSC.next());
		System.out.print("사용자 이름을 입력하세요 : ");
		user.setUserName(inputSC.next());
		System.out.print("사용자 전화번호를 입력하세요 : ");
		user.setUserPhoneNum(inputSC.next());
		
		user.insertUserInfo(user);
		
		System.out.println();
		System.out.println("사용자 정보가 등록되었습니다.");
		this.showCommonInfo("user"); //처리 후 메뉴 호출
	}
	
	/*
	 * 사용자 정보 삭제
	 */
	private void showUserInfoDelete() {
		User user = new User();
		
		System.out.println();
		System.out.println("==========사용자 정보 삭제==========");
		System.out.print("사용자 아이디를 입력하세요 : ");
		user.setUserID(inputSC.next());
		
		user.deleteUserInfo(user);

		System.out.println();
		System.out.println("사용자 정보가 삭제되었습니다.");
		this.showCommonInfo("user"); //처리 후 메뉴 호출
	}
	
	/*
	 * 사용자 정보 수정
	 */
	private void showUserInfoUpdate() {
		User user = new User();
		User updatedUser = new User();
		
		System.out.println();
		System.out.println("==========사용자 정보 수정==========");
		System.out.print("사용자 아이디를 입력하세요 : ");
		user.setUserID(inputSC.next());
		System.out.print("사용자 이름을 입력하세요 : ");
		updatedUser.setUserName(inputSC.next());
		System.out.print("사용자 전화번호를 입력하세요 : ");
		updatedUser.setUserPhoneNum(inputSC.next());
		
		user.updateUserInfo(user, updatedUser);
		
		System.out.println();
		System.out.println("사용자가 정보가 수정되었습니다.");
		this.showCommonInfo("user"); //처리 후 메뉴 호출
	}
	
	/*
	 * 사용자 정보 조회 
	 */
	private void showUserInfoSelect() {
		User user = new User();
		
		System.out.println();
		System.out.println("==========사용자 정보 조회==========");
		System.out.print("사용자 아이디를 입력하세요[전체조회는 'A'를 입력하세요.] : ");
		
		String inputUserID = inputSC.next();
		
		if (inputUserID.equals("A")) {
			user.selectUserAllInfo(user);
		} else {
			user.setUserID(inputUserID);
			user.selectUserInfo(user);
		}
		
		System.out.println();
		System.out.println("사용자 정보를 조회했습니다.");
		this.showCommonInfo("user");
	}
	//Level2-1 Menu(사용자 정보 관리) End
	
	//Level2-2 Menu(도서 정보 관리) Start
	/*
	 * 도서 정보 등록 
	 */
	private void showBookInfoInsert() {
		Book book = new Book();
		
		System.out.println();
		System.out.println("==========도서 정보 등록==========");
		System.out.print("도서 아이디를 입력하세요 : ");
		book.setBookID(inputSC.next());
		System.out.print("도서 제목을 입력하세요 : ");
		book.setBookTitle(inputSC.next());
		System.out.print("도서 ISBN을 입력하세요 : ");
		book.setBookISBN(inputSC.next());
		
		//정보확인 후 맞다고 선택하면 등록 아니면 재등록 기능 필요
		book.insertBookInfo(book);
		
		System.out.println();
		System.out.println("도서정보가 등록되었습니다.");
		this.showCommonInfo("book"); //처리 후 메뉴 호출
	}
	
	/*
	 * 도서 정보 삭제
	 */
	private void showBookInfoDelete() {
		Book book = new Book();
		
		System.out.println();
		System.out.println("==========도서 정보 삭제==========");
		System.out.print("도서 아이디를 입력하세요 : ");
		book.setBookID(inputSC.next());
		
		book.deleteBookInfo(book);

		System.out.println();
		System.out.println("도서 정보가 삭제되었습니다.");
		this.showCommonInfo("book"); //처리 후 메뉴 호출
	}
	
	/*
	 * 도서 정보 수정
	 */
	private void showBookInfoUpdate() {
		Book book = new Book();
		Book updatedBook = new Book();
		
		System.out.println();
		System.out.println("==========사용자 정보 수정==========");
		System.out.print("도서 아이디를 입력하세요 : ");
		book.setBookID(inputSC.next());
		System.out.print("도서 제목을 입력하세요 : ");
		updatedBook.setBookTitle(inputSC.next());
		System.out.print("도서 ISBN을 입력하세요 : ");
		updatedBook.setBookISBN(inputSC.next());
		
		book.updateBookInfo(book, updatedBook);
		
		System.out.println();
		System.out.println("도서 정보가 수정되었습니다.");
		this.showCommonInfo("book"); //처리 후 메뉴 호출
	}
	
	/*
	 * 도서 정보 조회 
	 */
	private void showBookInfoSelect() {
		Book book = new Book();
		
		System.out.println();
		System.out.println("==========도서 정보 조회==========");
		System.out.print("도서 번호를 입력하세요[전체조회는 'A'를 입력하세요.] : ");
		
		String inputBookNo = inputSC.next();
		
		if (inputBookNo.equals("A")) {
			book.selectBookAllInfo(book);
		} else {
			book.setBookID(inputBookNo);
			book.selectBookInfo(book);
		}
		
		System.out.println();
		System.out.println("도서정보를 조회했습니다.");
		this.showCommonInfo("book");
	}
	//Level2-2 Menu(도서 정보 관리) End
	
	//Level2-3 Menu(도서 대여 관리) Start
	/*
	 * 도서 대출 등록
	 */
	private void showInOutInfoOutgoing() {
		BookInOut bookInOut = new BookInOut();
		
		System.out.println();
		System.out.println("==========도서 대출 등록==========");
		System.out.print("사용자 아이디를 입력하세요 : ");
		bookInOut.setUserID(inputSC.next());
		System.out.print("사용자 이름을 입력하세요 : ");
		bookInOut.setUserName(inputSC.next());
		System.out.print("도서 아이디를 입력하세요 : ");
		bookInOut.setBookID(inputSC.next());
		System.out.print("도서 제목을 입력하세요 : ");
		bookInOut.setBookName(inputSC.next());
		System.out.print("일자를 입력하세요 : ");
		bookInOut.setInOutDate(inputSC.next());
		bookInOut.setInOutType("O");
		
		bookInOut.incomingInOutInfo(bookInOut);
		
		System.out.println();
		System.out.println("도서 대출 정보가 등록되었습니다.");
		this.showCommonInfo("inOut"); //처리 후 메뉴 호출
	}
	
	/*
	 * 도서 반납 등록
	 */
	private void showInOutInfoIncoming() {
		BookInOut bookInOut = new BookInOut();
		
		System.out.println();
		System.out.println("==========도서 반납 등록==========");
		System.out.print("사용자 아이디를 입력하세요 : ");
		bookInOut.setUserID(inputSC.next());
		System.out.print("사용자 이름을 입력하세요 : ");
		bookInOut.setUserName(inputSC.next());
		System.out.print("도서 아이디를 입력하세요 : ");
		bookInOut.setBookID(inputSC.next());
		System.out.print("도서 제목을 입력하세요 : ");
		bookInOut.setBookName(inputSC.next());
		System.out.print("일자를 입력하세요 : ");
		bookInOut.setInOutDate(inputSC.next());
		bookInOut.setInOutType("I");
		
		bookInOut.incomingInOutInfo(bookInOut);
		
		System.out.println();
		System.out.println("도서 반입 정보가 등록되었습니다.");
		this.showCommonInfo("inOut"); //처리 후 메뉴 호출
	}
	
	/*
	 * 도서 대여 이력 조회
	 */
	private void showInOutInfoSelect() {
		BookInOut bookInOut = new BookInOut();
		
		System.out.println();
		System.out.println("==========도서 대여 이력 조회==========");
		System.out.print("사용자 아이디를 입력하세요[전체조회는 'A'를 입력하세요.] : ");
		
		String inputUserID = inputSC.next();
		
		if (inputUserID.equals("A")) {
			bookInOut.selectInOutAllInfo(bookInOut);
		} else {
			bookInOut.setUserID(inputUserID);
			bookInOut.selectInOutInfo(bookInOut);
		}
		
		System.out.println();
		System.out.println("도서 대여 이력을 조회했습니다.");

		this.showCommonInfo("inOut"); //처리 후 메뉴 호출
	}
	//Level2-3 Menu(도서 대여 관리) End
	
	/*
	 * 공통메뉴
	 */
	private void showCommonInfo(String preShowType) {
		System.out.println();
		System.out.println("========================================");
		System.out.println("[8] 최초화면");
		System.out.println("[9] 이전화면");
		System.out.println("[0] 프로그램 종료");
		System.out.println("========================================");
		System.out.print("실행할 메뉴의 번호를 입력하세요 : ");
		
		inputNum = inputSC.nextInt();
		
		if (inputNum == 8) {
			this.showMain();
		} else if (inputNum == 9) {
			if (preShowType.equals("user")) {
				this.showUserInfoManagement();
			} else if (preShowType.equals("book")) {
				this.showBookInfoManagement();
			} else if (preShowType.equals("inOut")) {
				this.showBookInOutManagement();
			}
		} else if (inputNum == 0) {
			this.end();
		}
	}
	
	/*
	 * 프로그램 종료
	 */
	private void end() {
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
