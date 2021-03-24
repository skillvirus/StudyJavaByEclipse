package lecture.example;

public class OperatorLogic {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		boolean d = a & b;
		boolean e = a | b;
		boolean f = a ^ b;
		boolean g = a && b;
		boolean h = a && c;
		boolean i = a || b;
		boolean j = a || c;
		boolean k = !a;
		
		System.out.println(a + "과(와) " + b + "의 \"&\" 연산 결과는 [" + d + "] 입니다.");
		System.out.println(a + "과(와) " + b + "의 \"|\" 연산 결과는 [" + e + "] 입니다.");
		System.out.println(a + "과(와) " + b + "의 \"^\" 연산 결과는 [" + f + "] 입니다.");
		System.out.println(a + "과(와) " + b + "의 \"&&\" 연산 결과는 [" + g + "] 입니다.");
		System.out.println(a + "과(와) " + c + "의 \"&&\" 연산 결과는 [" + h + "] 입니다.");
		System.out.println(a + "과(와) " + b + "의 \"||\" 연산 결과는 [" + i + "] 입니다.");
		System.out.println(a + "과(와) " + c + "의 \"||\" 연산 결과는 [" + j + "] 입니다.");
		System.out.println(a + "의 \"!\" 연산 결과는 [" + k + "] 입니다.");
		
	}

}
