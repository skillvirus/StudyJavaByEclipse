package lecture.example;

public class OperatorRelation {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 10;
		
		boolean d = a > b;
		boolean e = a >= b;
		boolean f = a < b;
		boolean g = a <= b;
		boolean h = a == c;
		boolean i = a != b;
		
		System.out.println(a + "가(이) " + b + "보다 큰 것은 [" + d + "] 입니다.");
		System.out.println(a + "가(이) " + b + "보다 크거나 같다는 것은 [" + e + "] 입니다.");
		System.out.println(a + "가(이) " + b + "보다 작다는 것은 [" + f + "] 입니다.");
		System.out.println(a + "가(이) " + b + "보다 작거나 같다는 것은 [" + g + "] 입니다.");
		System.out.println(a + "가(이) " + c + "과(와) 같다는 것은 [" + h + "] 입니다.");
		System.out.println(a + "가(이) " + b + "과(와) 다르다는 것은 [" + i + "] 입니다.");
		
	}

}
