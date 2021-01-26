package lecture.example;

public class RepetitaionForStar {
	public static void main(String[] args) {
		
		for(int loopCount1 = 0; loopCount1 < 5; loopCount1++) {
//			for(int loopCount3 = loopCount1; loopCount3 < 5 - 1; loopCount3++) {
//				System.out.print(" ");
//			}
			for(int loopCount2 = 0; loopCount2 <= loopCount1; loopCount2++) {
				System.out.print("*");
			}
			
//			for(int loopCount2 = 0; loopCount2 < loopCount1 * 2 + 1; loopCount2++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}
}
