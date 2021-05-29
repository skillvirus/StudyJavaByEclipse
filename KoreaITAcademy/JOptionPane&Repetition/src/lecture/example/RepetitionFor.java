package lecture.example;

public class RepetitionFor {

	public static void main(String[] args) {
		int toNum = 20;
		int sum = 0;
		
		for(int i = 0; i <= toNum; i++) {
			sum += i;
		}
		
		System.out.println("1 부터 " + toNum + " 까지의 합 : " + sum);
	}
}
