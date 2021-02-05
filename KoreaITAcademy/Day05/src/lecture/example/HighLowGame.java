package lecture.example;
import java.util.Random;
import java.util.Scanner;

public class HighLowGame {

	public static void main(String[] args) {

		//High Low 게임 (사용자가 임의의 수를 맞추는 게임)
		//1. 1~30중에 아무 숫자를 랜덤으로 생성
		//2. 사용자가 1~30 사이의 숫자를 입력받음
		//3. 맞으면 "숫자를 맞췄습니다." 출력
		//4. 작으면 "좀 더 큰 수를 입력하세요"라고 출력
		//5. 크면 "좀 더 작은 수를 입력하세요"라고 출력
		
		//6. 맞출때까지 반복(무한루프)
		//7. 시도한 횟수 출력
		
		Random random = new Random();
		int randomNum = random.nextInt(30) + 1; //0~29까지의 랜덤수, +1을 하여 1~30으로 변경
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
