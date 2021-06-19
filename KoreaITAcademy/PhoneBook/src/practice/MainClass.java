package practice;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		PhoneBook[] phoneBook = new PhoneBook[100];
		
		System.out.println("-----전화번호부-----");
		
		Scanner scn = new Scanner(System.in);
		
		int inputNum = 0;
		int maxIndex = 0;
		
		while(true) {
			
			System.out.println("1. 번호 등록");
			System.out.println("2. 번호 수정");
			System.out.println("3. 번호 삭제");
			System.out.println("4. 번호 조회");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호를 선택하세요 : ");
			inputNum = scn.nextInt();
			
			System.out.println("");
			
			if (inputNum == 1) { //번호 등록
				
				phoneBook[maxIndex] = new PhoneBook();
				
				System.out.print("이름 : ");
				phoneBook[maxIndex].setName(scn.next());
				System.out.print("폰 번호 : ");
				phoneBook[maxIndex].setPhoneNum(scn.next());
				System.out.print("주소 : ");
				phoneBook[maxIndex].setAddress(scn.next());
				
				System.out.println("");
				
				maxIndex++;
				
			} else if (inputNum == 2) { //번호 수정
				
				System.out.print("수정할 번호의 INDEX를 입력하세요 : ");
				int inputIndex = scn.nextInt();
				phoneBook[inputIndex] = new PhoneBook();
				
				System.out.print("이름 : " + phoneBook[inputIndex].getName());
				phoneBook[inputIndex].setName(scn.next());
				System.out.print("폰 번호 : ");
				phoneBook[inputIndex].setPhoneNum(scn.next());
				System.out.print("주소 : ");
				phoneBook[inputIndex].setAddress(scn.next());
				
				System.out.println("");
				
			} else if (inputNum == 3) { //번호 삭제
				
				System.out.print("삭제할 번호의 INDEX를 입력하세요 : ");
				int inputIndex = scn.nextInt();
				phoneBook[inputIndex] = new PhoneBook();
				
				phoneBook[inputIndex].setName("");
				phoneBook[inputIndex].setPhoneNum("");
				phoneBook[inputIndex].setAddress("");
				
			} else if (inputNum == 4) { //번호 조회
				
				System.out.println("INDEX | 이름 | 폰 번호 | 주소");
				for(int i = 0; i < maxIndex; i++) {
					System.out.println(i + " | " + phoneBook[i].getName() + " | " + phoneBook[i].getPhoneNum() + " | " + phoneBook[i].getAddress());
				}
				
				System.out.println("");
				
			} else if (inputNum == 5) { //프로그램 종료
				
				System.out.println("프로그램을 종료합니다.");
				scn.close();
				System.exit(0);
				
			} else {
				System.out.println("메뉴 번호를 확인하세요.");
			}
		}
	}
}
