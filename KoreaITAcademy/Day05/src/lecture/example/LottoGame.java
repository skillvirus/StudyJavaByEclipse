package lecture.example;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {

		//로또 게임
		//1. 1~45 까지의 랜덤수 6개 생성 (각 6개의 수는 중복 불가)
		//  1-1. 6개의 수에 대한 중복체크 로직 필수
		//2. 사용자로부터 6개의 수(1부터 45중 하나)를 입력받는다(중복 불가)
		//  2-1. 6개의 수에 대한 중복체크 로직 필수
		//  2-2. 1~45 외의 수는 입력 불가
		//3. 4개 맞으면 4등, 5개 맞으면 3등, 5개+보너스 맞으면 2등, 6개 맞으면 1등 (보너스번호는 무시, 2등은 없는걸로 한다.)
		
		Random random = new Random();
		int randomNum;
		
		int[] lottoNum = new int[6];
		
//		lottoNum[0] = random.nextInt(45) + 1;
//		lottoNum[1] = random.nextInt(45) + 1;
//		lottoNum[2] = random.nextInt(45) + 1;
//		lottoNum[3] = random.nextInt(45) + 1;
//		lottoNum[4] = random.nextInt(45) + 1;
//		lottoNum[5] = random.nextInt(45) + 1;
		
//		int duplicateCount = 0;
//		int duplicateNum = 0;
		
		for (int loopCount = 0; loopCount <= 5; loopCount++) {
			randomNum = random.nextInt(45) + 1;
			
			if (loopCount == 0) {
				lottoNum[loopCount] = randomNum;	
			} else {
				for (int loopCount2 = 0; loopCount2 < loopCount; loopCount2++) {
					if (lottoNum[loopCount2] == randomNum) {
						//duplicateCount++;
//						duplicateNum = randomNum;
						randomNum = random.nextInt(45) + 1;
						loopCount2 = -1;
					}
				}
				lottoNum[loopCount] = randomNum;
			}
		}
		
		int[] inputNum = new int[6];
		Scanner inputSC = new Scanner(System.in);
		
		System.out.println("=========================로또게임===========================");
		System.out.println();
		
		//입력번호 체크(사용자 위임)_S
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[0] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[1] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[2] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[3] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[4] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[5] = inputSC.nextInt();
		//입력번호 체크(사용자 위임)_E

		//입력번호 체크(반복문 이용)_S
//		int inputSCNum = 0;
//		
//		for (int loopCount5 = 0; loopCount5 <= 5; loopCount5++) {
//			System.out.print("1~45 중의 숫자 하나를 입력하세요 [" + (loopCount5 + 1) + "] : ");
//			inputSCNum = inputSC.nextInt();
//			
//			if (loopCount5 == 0) {
//				inputNum[loopCount5] = inputSCNum;
//			} else {
//				for (int loopCount6 = 0; loopCount6 < loopCount5; loopCount6++) {
//					if (inputSCNum == inputNum[loopCount6]) {
//						System.out.println("이미 입력한 숫자입니다. 다시입력하세요");
//						System.out.print("1~45 중의 숫자 하나를 입력하세요 [" + (loopCount5 + 1) + "] : ");
//						inputSCNum = inputSC.nextInt();
//						loopCount6 = -1;
//					}
//					
//				}
//				inputNum[loopCount5] = inputSCNum;
//			}
//		}
		//입력번호 체크(반복문 이용)_E
		
		int correctCount = 0;
		
		for (int loopCount3 = 0; loopCount3 < lottoNum.length; loopCount3++) {
			for (int loopCount4 = 0; loopCount4 < inputNum.length; loopCount4++) {
				if (lottoNum[loopCount3] == inputNum[loopCount4]) {
					correctCount++;
				}
			}
		}
		
		System.out.println();
		System.out.println("==========================================================");
		
		System.out.println("로또 당첨 번호는 : " + lottoNum[0] + "," + lottoNum[1] + "," + lottoNum[2] + "," + lottoNum[3] + "," + lottoNum[4] + "," + lottoNum[5]);
		System.out.println("당신의 입력 번호 : " + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + "," + inputNum[5]);
		System.out.println("당신이 맞춘 수는 : " + correctCount + "개 입니다.");
		
		System.out.println("==========================================================");
		System.out.println();
		
		if (correctCount == 4) {
			System.out.println("4등입니다.");
		} else if (correctCount == 5) {
			System.out.println("3등입니다.");
		} else if (correctCount == 6) {
			System.out.println("1등입니다.");
		} else {
			System.out.println("등수 외입니다.");
		}
			
		
//		for (int loopCount = 0; loopCount < lottoNum.length; loopCount++) {
//			System.out.println(lottoNum[loopCount]);
//		}
		
//		System.out.println("중복횟수 : " + duplicateCount);
//		System.out.println("중복수 : " + duplicateNum);
		
		inputSC.close();
		
	}

}