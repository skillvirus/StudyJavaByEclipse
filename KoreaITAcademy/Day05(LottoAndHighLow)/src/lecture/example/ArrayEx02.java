package lecture.example;

public class ArrayEx02 {

	public static void main(String[] args) {
		//다차원 배열
		
		/*
			국어	영어	수학
		 1	100		100		100
		 2	90		90		80
		 3	80		100		70
		 4	80		80		80
		 5	90		70		100
		 
		*/
		
		
		//int[][] score = new int[5][3];
		
		int[][] score = {
							{100, 100, 100},
							{90, 90, 80},
							{80, 100, 70},
							{80, 80, 80},
							{90, 70, 100}
					  	};
		
		
		for (int loopCount1 = 0; loopCount1 < score.length; loopCount1++) {
			for (int loopCount2 = 0; loopCount2 < score[loopCount1].length; loopCount2++) {
				System.out.print(score[loopCount1][loopCount2] + (loopCount2 < 2 ? "," : ""));
			}
			System.out.println();
		}
	}

}
