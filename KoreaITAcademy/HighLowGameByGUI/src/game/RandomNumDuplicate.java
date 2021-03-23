package game;

public class RandomNumDuplicate {

	RandomNum random;
	
	/**
	 * 기본생성자
	 */
	public RandomNumDuplicate() {
		
	}
	
	/**
	 * 생성자 오버로딩
	 */
	public RandomNumDuplicate(RandomNum random) {
		this.random = random;
	}
	
	/*
	 * 중복체크 후 랜덤수를 리턴
	 * */
	public int[] returnRandomNum(int arryCnt) {
		
		int[] returnValue = new int[arryCnt];
		
		int randomNum;
		
		for (int loopCount = 0; loopCount < arryCnt; loopCount++) {
			randomNum = random.getRandomNum();
			
			if (loopCount == 0) {
				returnValue[loopCount] = randomNum;
			} else {
				for (int loopCount2 = 0; loopCount2 < loopCount; loopCount2++) {
					if (returnValue[loopCount2] == randomNum) {
						randomNum = random.getRandomNum();
						loopCount2 = -1;
					}
				}
				returnValue[loopCount] = randomNum;
			}
		}
		//랜덤 번호 중복 체크_E
		
		return returnValue;
	}
}