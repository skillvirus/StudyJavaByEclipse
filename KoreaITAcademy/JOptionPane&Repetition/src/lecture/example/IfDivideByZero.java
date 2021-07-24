package lecture.example;

import java.util.Scanner;

public class IfDivideByZero {
	public static void main(String[] args) {
		double i, j;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("나눗셈을 하고 싶은 2개의 수 중 첫 번째 수를 입력하세요 : ");
		i = scn.nextDouble();
		
		System.out.print("나눗셈을 하고 싶은 2개의 수 중 두 번째 수를 입력하세요 : ");
		j = scn.nextDouble();
		
		if ( j == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			scn.close();
			return;
		}
		
		System.out.println(i + "를 " + j + "로 나눈 결과 : " + i / j);
		
		scn.close();
	}
}