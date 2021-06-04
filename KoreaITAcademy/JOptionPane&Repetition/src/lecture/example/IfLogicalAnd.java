package lecture.example;
import java.util.Scanner;

public class IfLogicalAnd {
	public static void main(String[] args) {
		int a;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("아무 숫자(정수)나 입력해주세요 : ");
		a = scn.nextInt();
		
		if (a >= 10 && a < 20) {
			System.out.println(a + "은(는) 10 이상이고, 20 미만인 수 입니다.");
		}
		
		scn.close();
	}
}
