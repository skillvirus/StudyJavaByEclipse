package lecture.example.methodEx;

public class MethodTest {
	public static void main(String[] args) {
		//두수를 더하는 일을 수행

		//변수 미학습
//		System.out.println(3 + 10);
//		System.out.println(10 + 20);
		
		//변수 학습
//		int num1 = 3;
//		int num2 = 10;
//		
//		System.out.println(num1 + num2);
//		
//		int num3 = 10;
//		int num4 = 20;
//		
//		System.out.println(num3 + num4);
		
		//메서드 학습
		sum(3, 10);
		sum(10, 20);
	}
	
	public static void sum(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println(num3);
	}
}
