package lecture.example;

public class ContinueTest {

	public static void main(String[] args) {
		
		int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            sum += i;
        }

        System.out.println("sum = " + sum);		
	}
}
