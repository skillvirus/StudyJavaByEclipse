package lecture.example.classex;

import java.util.Scanner;

public class LottoWinTestUser {

	//0. 로또 당첨 가능 횟수를 시뮬레이션
	//1. 사용자에게 6개의 수를 입력받는다.
	//2. 랜덤수를 생성해서 사용자의 수와 모두(6개) 일치할 때까지 반복
	//3. 6개의 수가 모두 일치하면 반복 종료
	//4. 횟수 출력
		
	public static void main(String[] args) {

//		int randomCount = 2;
//		
//		
//		RandomNum random;
//		random = new RandomNum(45);
//		RandomNumDuplicate randomNumDup;
//		randomNumDup = new RandomNumDuplicate(random);
//
//		int[] lottoNum;
//		lottoNum = randomNumDup.returnRandomNum(randomCount);
//		
//		int[] inputNum = new int[randomCount];
//		Scanner inputSC = new Scanner(System.in);
//		
//		System.out.println("=========================로또게임=========================");
//		System.out.println();
//		
//		//입력번호 중복 체크(반복문 이용)_S
//		int inputSCNum = 0;
//		
//		for (int loopCount5 = 0; loopCount5 < randomCount; loopCount5++) {
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
//		//입력번호 중복 체크(반복문 이용)_E
//		
//		//비교
//		int compareResult = 0;
//		long compareCount = 0L;
//		
//		//1. 사용자가 입력한 첫번째 수와 6개의 랜덤 수를 비교
//		// 1-1. 6개중 사용자가 입력한 수가 없으면 6개의 수를 다시 랜덤 생성
//		// 1-2. 6개중 사용자가 입력한 수가 있다
//		//2. 일치하는 수를 별도의 배열(length:6, index:1)에 저장 
//		//3. 5개의 수를 다시 랜덤 생성
//		//4. 두번깨 수와 5개의 랜덤 수를 비교
//		// 4-1. 5개중 사용자가 입력한 수가 없으면 5개의 수를 다시 랜덤 생성
//		//계속
//		
//		int[] resultNum = new int[randomCount];
//		
//		int loopCount1 = 0;
//		int loopCount2 = 0;
//		
//		while (true) {
//		
//			for (loopCount1 = 0; loopCount1 < inputNum.length; loopCount1++) {
//				for (loopCount2 = 0; loopCount2 < lottoNum.length; loopCount2++) {
//					if (inputNum[loopCount1] == lottoNum[loopCount2]) {
//						compareResult++;
//						resultNum[loopCount1] = lottoNum[loopCount2];
//						break;
//					}
//				}
//			}
//			
//			if (compareResult == 0) {
//				random = new RandomNum(45);
//				randomNumDup = new RandomNumDuplicate(random);
//				lottoNum = randomNumDup.returnRandomNum(randomCount - loopCount1);
//				
//			} else {
//				resultNum[loopCount1] = lottoNum[loopCount2];
//				
//				random = new RandomNum(45);
//				randomNumDup = new RandomNumDuplicate(random);
//				lottoNum = randomNumDup.returnRandomNum(randomCount - (loopCount1 + 1));
//			}
//			
//			//compareCount++;
//			System.out.println(compareCount + "회 비교");
//			
//			if (compareResult == randomCount) {
//				break;
//			}
//		}
//		
//		
//		System.out.println("최종 비교 횟수 : " + compareCount);
//		inputSC.close();
	}

}
