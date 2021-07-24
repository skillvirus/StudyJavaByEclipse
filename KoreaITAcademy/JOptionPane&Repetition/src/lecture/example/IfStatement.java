package lecture.example;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("입력하고 싶은 숫자를 입력하세요 : ");
		
		int i = inputScanner.nextInt();
		
		if (i == 7) {
			System.out.println("당신은 행운의 숫자 7을 입력했습니다.");
		}
		inputScanner.close();
	}
}