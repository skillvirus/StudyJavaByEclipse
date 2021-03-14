package lecture.example.classEx.advanced;

//import java.util.Random;
import java.util.Scanner;

public class LottoGameByClass {

	public static void main(String[] args) {

		//Random random = new Random();
		RandomNum random = new RandomNum(45);
		RandomNumDuplicate randomNumDup = new RandomNumDuplicate(random);
		//int randomNum;
		
		//int[] lottoNum = new int[6];
		int[] lottoNum = randomNumDup.returnRandomNum(6);
		
//		//랜덤 번호 중복 체크_S
//		for (int loopCount = 0; loopCount < 6; loopCount++) {
//			//randomNum = random.nextInt(45) + 1;
//			randomNum = random.getRandomNum();
//			
//			if (loopCount == 0) {
//				lottoNum[loopCount] = randomNum;
//			} else {
//				for (int loopCount2 = 0; loopCount2 < loopCount; loopCount2++) {
//					if (lottoNum[loopCount2] == randomNum) {
//						//randomNum = random.nextInt(45) + 1;
//						randomNum = random.getRandomNum();
//						loopCount2 = -1;
//					}
//				}
//				lottoNum[loopCount] = randomNum;
//			}
//		}
//		//랜덤 번호 중복 체크_E
		
		int[] inputNum = new int[6];
		Scanner inputSC = new Scanner(System.in);
		
		System.out.println("=========================로또게임=========================");
		System.out.println();
		
		//입력번호 중복 체크(반복문 이용)_S
		int inputSCNum = 0;
		
		for (int loopCount5 = 0; loopCount5 < 6; loopCount5++) {
			System.out.print("1~45 중의 숫자 하나를 입력하세요 [" + (loopCount5 + 1) + "] : ");
			inputSCNum = inputSC.nextInt();
			
			if (loopCount5 == 0) {
				inputNum[loopCount5] = inputSCNum;
			} else {
				for (int loopCount6 = 0; loopCount6 < loopCount5; loopCount6++) {
					if (inputSCNum == inputNum[loopCount6]) {
						System.out.println("이미 입력한 숫자입니다. 다시입력하세요");
						System.out.print("1~45 중의 숫자 하나를 입력하세요 [" + (loopCount5 + 1) + "] : ");
						inputSCNum = inputSC.nextInt();
						loopCount6 = -1;
					}
					
				}
				inputNum[loopCount5] = inputSCNum;
			}
		}
		//입력번호 중복 체크(반복문 이용)_E
		
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
		
		System.out.println("로또 번호 : [" + lottoNum[0] + "][" + lottoNum[1] + "][" + lottoNum[2] + "][" + lottoNum[3] + "][" + lottoNum[4] + "][" + lottoNum[5] + "]");
		System.out.println("선택 번호 : [" + inputNum[0] + "][" + inputNum[1] + "][" + inputNum[2] + "][" + inputNum[3] + "][" + inputNum[4] + "][" + inputNum[5] + "]");
		System.out.println("맞춘 수   : " + correctCount + "개 입니다.");
		
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
		
		inputSC.close();
		
	}

}
