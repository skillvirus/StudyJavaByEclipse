package lecture.example.classEx.advanced;

import java.util.Scanner;

public class HighLowGameByClass {

	public static void main(String[] args) {

//		Random random = new Random();
//		int randomNum = random.nextInt(30) + 1; //0~29까지의 랜덤수, +1을 하여 1~30으로 변경
		
		RandomNum random = new RandomNum(40);
		int randomNum = random.getRandomNum(30); //0~29까지의 랜덤수, +1을 하여 1~30으로 변경
		
		int tryCount = 0; //시도한 횟수
		
		Scanner inputSC;
		int inputNum;
		
		System.out.println("=======================하이로우게임=======================");
		System.out.println();
		
		while (true) {
			
			inputSC = new Scanner(System.in);
			System.out.print("1~30 중에 아무 숫자를 입력하세요 : ");
			inputNum = inputSC.nextInt();
			tryCount++;
			
			if (randomNum == inputNum) {
				System.out.println();
				System.out.println("숫자를 맞췄습니다.");
				System.out.println();
				break;
			} else if (inputNum < randomNum) {
				System.out.println("좀 더 큰 수를 입력하세요.");
				continue;
			} else if (inputNum > randomNum) {
				System.out.println("좀 더 작은 수를 입력하세요.");
				continue;
			}
		
		}
		
		System.out.println("==========================================================");
		System.out.println();
		System.out.println("임의의 숫자는 " + randomNum + "입니다.");
		System.out.println("시도한 휫수는 " + tryCount + "회 입니다.");
		
		inputSC.close();
	}

}
