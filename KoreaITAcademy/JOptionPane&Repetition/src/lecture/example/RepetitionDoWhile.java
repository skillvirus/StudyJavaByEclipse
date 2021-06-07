package lecture.example;

public class RepetitionDoWhile {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i < 1);
		
		System.out.println("sum : " + sum);
	}
}
