package lecture.example;
import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("아무 숫자(정수)나 입력해보세요 : ");
		num = scn.nextInt();
		
		if (num == 7) {
			System.out.println("행운의 숫자 7이군요.");
		}
		else {
			System.out.println("그냥 보통 숫자인 " + num + "을 입력했군요.");
		}
		
		scn.close();
	}
}
