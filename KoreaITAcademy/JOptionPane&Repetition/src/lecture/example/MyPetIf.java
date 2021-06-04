package lecture.example;
import java.util.Scanner;

public class MyPetIf {
	public static void main(String[] args) {
		int input;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("=====마이펫=====");
		System.out.println("1. 밥주기");
		System.out.println("2. 밥주기");
		System.out.println("3. 밥주기");
		System.out.print("무엇을 할 것인지 입력하세요 : ");
		
		input = scn.nextInt();
		
		if (input == 1) {
			System.out.println("아이 맛있어");
		}
		else if (input == 2) {
			System.out.println("아이 시원해");
		}
		else if (input == 3) {
			System.out.println("ZZZ");
		}
		else {
			System.out.println("무슨 명령인지 못 알아 듣겠어.");
		}
		
		scn.close();
	}
}
