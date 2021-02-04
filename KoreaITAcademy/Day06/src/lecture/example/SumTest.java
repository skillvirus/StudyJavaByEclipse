package lecture.example;

public class SumTest {
	
	private void sumPrivate(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	
	public void sumPublic(int num1, int num2) {
		sumPrivate(num1, num2);
	}
}
