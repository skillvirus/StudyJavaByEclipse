package lecture.example.classEx.advanced;
import java.util.Random;

public class RandomNum {
	
	//난수를 생성하는 클래스
	
	Random random;
	int randomNum;
	int maxNum;
	
	RandomNum() { //생성자
		random = new Random();
	}
	
	RandomNum(int maxNum) { //생성자 오버로딩
		random = new Random();
		this.maxNum = maxNum;
	}
	
	public int getRandomNum() {
		return randomNum = random.nextInt(this.maxNum) + 1;
	}
	
	public int getRandomNum(int maxNum) { //매서드 오버로딩
		return randomNum = random.nextInt(maxNum) + 1;
	}
}
