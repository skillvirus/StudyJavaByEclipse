package lecture.example;
import java.util.Scanner;

public class ArrayStudentScore {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int score[][] = new int[3][2];
		
		for (int i = 0; i < 3; i++) { //총 3명의 데이터를 입력 받음
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.print(i + 1 + " 번째 학생의 국어 점수 : ");
					score[i][j] = scn.nextInt();
				}
				
				if (j == 1) {
					System.out.print(i + 1 + " 번째 학생의 수학 점수 : ");
					score[i][j] = scn.nextInt();
				}
			}
			System.out.println();
		}
		
		System.out.println("-----결과-----");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 학생의 국어 점수 : " + score[i][0] + ", 수학 점수 : " + score[i][1]);
		}
		
		scn.close();
	}
}
