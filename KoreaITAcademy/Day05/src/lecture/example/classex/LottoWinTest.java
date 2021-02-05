package lecture.example.classex;
import java.text.DecimalFormat;

public class LottoWinTest {

	public static void main(String[] args) {

		DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###"); //천단위 구분자 지정
		
		int testCount = 50;
		long[] result = new long[testCount];
		
		for (int loopCount = 0; loopCount < testCount; loopCount++) {
			System.out.println((loopCount + 1) + "회 테스트 결과");
			result[loopCount] = testLottoWin();
			System.out.println();
		}
		
		long maxValue = result[0];
		long minValue = result[0];
		long sumValue = 0L;
		
		for(int loopCount2 = 0; loopCount2 < result.length; loopCount2++) {
		    if(maxValue < result[loopCount2]) {
		    	maxValue = result[loopCount2];
		    }
					
		    if(minValue > result[loopCount2]) {
		    	minValue = result[loopCount2];
		    }
		    
		    sumValue += result[loopCount2];
		}
	
		System.out.println("테스트 끝");
		System.out.println();
		System.out.println("최소 값 : " + decimalFormat.format(minValue) + "회");
		System.out.println("최대 값 : " + decimalFormat.format(maxValue) + "회");
		System.out.println("평균 값 : " + decimalFormat.format(sumValue / result.length) + "회");
	}

	public static long testLottoWin() {
		int randomCount = 6;
		
		RandomNum random;
		random = new RandomNum(45);
		RandomNumDuplicate randomNumDup;
		randomNumDup = new RandomNumDuplicate(random);
		
		int[] lottoNum; 
		int[] inputNum = randomNumDup.returnRandomNum(randomCount);
		
		int correctCount = 0;
		long compareCount = 0;
		
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###"); //천단위 구분자 지정
		
		while (true) {
		
			lottoNum = randomNumDup.returnRandomNum(randomCount);
			
			for (int loopCount3 = 0; loopCount3 < lottoNum.length; loopCount3++) {
				for (int loopCount4 = 0; loopCount4 < inputNum.length; loopCount4++) {
					if (lottoNum[loopCount3] == inputNum[loopCount4]) {
						correctCount++;
					}
				}
			}
			
			compareCount++;
//			System.out.println(decimalFormat.format(compareCount) + "회 비교");
			
			if (randomCount == correctCount) {
				break;
			}
			
			correctCount = 0; //맞춘 횟수를 초기화해줘야 다시 비교함
		}
		
		System.out.print("로또 번호 : ");
		for (int loopCount1 = 0; loopCount1 < lottoNum.length; loopCount1++) {
			System.out.print("[" + lottoNum[loopCount1] + "]");
		}
		
		System.out.println();
		
		System.out.print("선택 번호 : ");
		for (int loopCount2 = 0; loopCount2 < inputNum.length; loopCount2++) {
			System.out.print("[" + inputNum[loopCount2] + "]");
		}
		
		System.out.println();
		System.out.println("총 횟수 " + decimalFormat.format(compareCount) + "회");
		
		return compareCount; 
	}
	
}

