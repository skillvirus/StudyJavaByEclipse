package lecture.example;

public class RepetitionDoWhile {

	public static void main(String[] args) {
		int loopCount = 0;
		
		do {
			System.out.println(loopCount);
		} while(loopCount++ < 10); //증가 후 출력
	}
}
