package lecture.example;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//배열 : 동일한 타입의 여려변수를 하나의 묶음(집합)으로 다루는 것
		//많은양의 데이터를 다룰 때 유용하다
		//배열의 각요소는 서로 연속적이다.
		//타입 또는 변수이름 뒤에 대괄호[]를 이용하여 배열을 선언
		
		//배열의 선언과 생성
		//int[] score; //배열선언
		//score = new int[5]; //배열생성
		
		//int[] score = new int[5];//1번
		//int score[] = new int[5]; //2번
		
		//배열초기화 //1번
		//score[0] = 100;
		//score[1] = 90;
		//score[2] = 80;
		//score[3] = 90;
		//score[4] = 70;
		
		//배열선언, 생성, 초기화 //2번
		//int[] score = {100, 90, 80, 90, 70};
		
		//오류
		//int[] score;
		//score = {100, 90, 80, 90, 70};
		
		int[] score;
		score = new int[] {100, 90, 80, 90, 70};
		
		
		for (int loopCount = 0; loopCount < score.length; loopCount++) {
			System.out.println(score[loopCount]);
		}			
	}
}
