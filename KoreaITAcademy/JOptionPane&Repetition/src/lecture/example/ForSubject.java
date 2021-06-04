package lecture.example;
import java.util.Scanner;

public class ForSubject {
	public static void main(String[] args) {
		int subject, score;
		double sumScore = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("몇 개의 과목 점수를 입력 받을 것인가요? ");
		subject = scn.nextInt();
		
		System.out.println("각 과목의 점수를 입력해주세요.");
		for (int i = 1; i <= subject; i++) {
			System.out.print("과목 " + i + " : ");
			score = scn.nextInt();
			sumScore += score;
		}
		
		System.out.println("전체 과목의 평균은 " + sumScore / subject);
		
		scn.close();
	}
}
