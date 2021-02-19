package book.view;

import java.util.Scanner;

public class Viewer {

	Scanner inputSC = new Scanner(System.in);
	int inputNum;
	
	public void start() {
		this.showMain();
	}
	
	private void showMain() {
		System.out.println();
		System.out.println("==========도서관 관리 프로그램==========");
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
	
	//Level1 Menu Start
	/*
	 * 사용자정보관리
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
		
		if (inputNum == 1) {
			
		} else if (inputNum == 2) {
			
		} else if (inputNum == 3) {
			
		} else if (inputNum == 4) {
			
		} else if (inputNum == 9) {
			this.showMain();
		} else if (inputNum == 0) {
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
		
		if (inputNum == 1) {
			
		} else if (inputNum == 2) {
			
		} else if (inputNum == 3) {
			
		} else if (inputNum == 4) {
			
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
		System.out.println("[9] 이전화면");
		System.out.println("[0] 프로그램 종료");
		System.out.println("========================================");
		System.out.print("실행할 메뉴의 번호를 입력하세요 : ");
		
		inputNum = inputSC.nextInt();
		
		if (inputNum == 1) {
			
		} else if (inputNum == 2) {
			
		} else if (inputNum == 9) {
			this.showMain();
		} else if (inputNum == 0) {
			this.end();
		}
	}
	//Level1 Menu End
	
	
	
	private void end() {
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
