package lecture.example;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {

		//로또 게임
		//1. 1~45 까지의 랜덤수 6개 필요 (각 6개의 수는 중복 불가)
		//2. 사용자로부터 6개의 수를 입력받는다.
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
				for (int loopCount2 = 0; loopCount2 <= loopCount; loopCount2++) {
					if (lottoNum[loopCount2] == randomNum) {
						//duplicateCount++;
//						duplicateNum = randomNum;
						randomNum = random.nextInt(45) + 1;
					}
				}
				lottoNum[loopCount] = randomNum;
			}
		}
		
		int[] inputNum = new int[6];
		Scanner inputSC = new Scanner(System.in);
		System.out.print("1~45 중에 숫자를 입력하세요 : ");
		inputNum[0] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + " 제외) : ");
		inputNum[1] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + " 제외) : ");
		inputNum[2] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + " 제외) : ");
		inputNum[3] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + " 제외) : ");
		inputNum[4] = inputSC.nextInt();
		
		System.out.print("1~45 중에 숫자를 입력하세요(" + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + " 제외) : ");
		inputNum[5] = inputSC.nextInt();
		
		int correctCount = 0;
		
		for (int loopCount3 = 0; loopCount3 < lottoNum.length; loopCount3++) {
			for (int loopCount4 = 0; loopCount4 < inputNum.length; loopCount4++) {
				if (lottoNum[loopCount3] == inputNum[loopCount4]) {
					correctCount++;
				}
			}
		}
		
		System.out.println("=============================================");
		System.out.println("로또 당첨 번호는 : " + lottoNum[0] + "," + lottoNum[1] + "," + lottoNum[2] + "," + lottoNum[3] + "," + lottoNum[4] + "," + lottoNum[5]);
		System.out.println("당신의 입력 번호 : " + inputNum[0] + "," + inputNum[1] + "," + inputNum[2] + "," + inputNum[3] + "," + inputNum[4] + "," + inputNum[5]);
		System.out.println("당신이 맞춘 수는 : " + correctCount + "개 입니다.");
		
//		for (int loopCount = 0; loopCount < lottoNum.length; loopCount++) {
//			System.out.println(lottoNum[loopCount]);
//		}
		
//		System.out.println("중복횟수 : " + duplicateCount);
//		System.out.println("중복수 : " + duplicateNum);
		
		inputSC.close();
		
	}

}
