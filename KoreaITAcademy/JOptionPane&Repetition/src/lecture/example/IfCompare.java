package lecture.example;
import java.util.Scanner;

public class IfCompare {
	public static void main(String[] args) {
		int i, j;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("크기를 비교할 2개의 수 중 첫 번째 수를 입력하세요 : ");
		i = scn.nextInt();
		System.out.print("크기를 비교할 2개의 수 중 두 번째 수를 입력하세요 : ");
		j = scn.nextInt();
		
		if (i > j) {
			System.out.println(i + "는(은) " + j + "보다 큽니다.");
		}
		if (i < j) {
			System.out.println(i + "는(은) " + j + "보다 작습니다.");
		}
		if (i >= j) {
			System.out.println(i + "는(은) " + j + "보다 크거나 같습니다.");
		}
		if (i <= j) {
			System.out.println(i + "는(은) " + j + "보다 작거나 같습니다.");
		}
		if (i == j) {
			System.out.println(i + "는(은) " + j + "와(과) 같습니다.");
		}
		if (i != j) {
			System.out.println(i + "는(은) " + j + "와(과) 다릅니다.");
		}
		
		scn.close();
	}
}
