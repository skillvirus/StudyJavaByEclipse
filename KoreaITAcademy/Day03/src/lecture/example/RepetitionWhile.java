package lecture.example;

public class RepetitionWhile {

	public static void main(String[] args) {
		
		int loopCount1 = 0;
		int loopCount2 = 0;
		int loopCount3 = 0;
		
		while (loopCount1 < 5) {
			loopCount3 = loopCount1;
			while (loopCount3 < 5 - 1) {
				System.out.print(" ");
				loopCount3++;
			}
			
			while (loopCount2 < loopCount1 * 2 + 1) {
				System.out.print("*");
				loopCount2++;
			}
			System.out.println();
			loopCount2 = 0;
			loopCount1++;
		}
	}
}
