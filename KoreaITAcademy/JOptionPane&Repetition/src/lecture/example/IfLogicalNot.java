package lecture.example;
import java.util.Scanner;

public class IfLogicalNot {
	public static void main(String[] args) {
		double height;
		double weight;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("당신의 키를 입력하세요 : ");
		height = scn.nextDouble();
		
		System.out.print("당신의 몸무게를 입력하세요 : ");
		weight = scn.nextDouble();
		
		if (height >= 190 || weight >= 100) {
			System.out.println("당신은 \'거구\'입니다.");
		}
		if (!(height >= 190 || weight >= 100)) {
			System.out.println("당신은 거구가 아닙니다.");
		}
		
		scn.close();
	}
}
