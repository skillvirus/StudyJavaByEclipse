package lecture.example;

public class RepetitionForTimesTable {

	public static void main(String[] args) {
		
		for (int loopCount1 = 2; loopCount1 <= 9; loopCount1++) {
			for (int loopCount2 = 1; loopCount2 <= 9; loopCount2++) {
				System.out.println(loopCount1 + " X " + loopCount2 + " = " + loopCount1 * loopCount2);
			}
			System.out.println();
		}
	}
}
