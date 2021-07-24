package lecture.example;

public class RepetitionWhile {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1 부터 100까지의 합 : " + sum);
	}
}
