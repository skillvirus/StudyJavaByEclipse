package lecture.example;
import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		int ave = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 학생의 성적 : ");
			arr[i] = scn.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			ave += arr[i];
		}

		System.out.println();
		System.out.println("평균은 : " + ave / 5.0); //정수 5로 나누었을 때?
		
		scn.close();
	}
}
