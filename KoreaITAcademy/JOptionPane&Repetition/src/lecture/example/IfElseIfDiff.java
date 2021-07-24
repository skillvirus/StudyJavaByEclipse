package lecture.example;
import java.util.Scanner;

public class IfElseIfDiff {

	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("아무 숫자나 입력해보세요 : ");
		num = scn.nextInt();
		
		if (num == 7) {
			System.out.println("[A] 행운의 숫자 7이군요.");
		}
		else if (num == 7) {
			System.out.println("[B] 행운의 숫자 7이군요.");
		}
		if (num == 7) {
			System.out.println("[C] 행운의 숫자 7이군요.");
		}
		if (num == 7) {
			System.out.println("[D] 행운의 숫자 7이군요.");
		}
		
		scn.close();
	}
}
