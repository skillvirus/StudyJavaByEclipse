package lecture.example;
import java.util.Scanner;

public class MyPetSwitch {
	public static void main(String[] args) {
		int input;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("=====마이펫=====");
		System.out.println("1. 밥주기");
		System.out.println("2. 씻기기");
		System.out.println("3. 재우기");
		System.out.print("무엇을 할 것인지 입력하세요 : ");
		
		input = scn.nextInt();
		
		switch(input) {
			case 1:
				System.out.println("아이 맛있어");
				break;
			case 2:
				System.out.println("아이 시원해");
				break;
			case 3:
				System.out.println("ZZZ");
				break;
			default:
				System.out.println("무슨 명령인지 못 알아 듣겠어.");
				break;
		}
		
		scn.close();
	}
}
