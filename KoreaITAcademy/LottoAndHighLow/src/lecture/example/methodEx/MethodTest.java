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
		
//		public static void sum(int num1, int num2) {
//		int num3 = num1 + num2;
//		System.out.println(num3);
		
		//클래스, 메서드 학습
		MethodEx me = new MethodEx();
		
		System.out.print("1. 반환형, 매개변수 둘 다 없는 메서드 : "); 
		me.sum0();
		
		System.out.print("2. 반환형은 없고, 매개변수(정수형)는 있는 메서드 : ");
		me.sum1(3, 10);
		
		System.out.print("3. 반환형(정수형), 매개변수(정수형) 둘 다 있는 메서드 : ");
		System.out.println(me.sum2(10, 20));
		
		System.out.print("4. 반환형(문자열형), 매개변수(정수형) 둘 다 있는 메서드 : ");
		System.out.println(me.sum3(10, 20));
		
		System.out.print("5. 반환형(실수형), 매개변수(정수형) 둘 다 있는 메서드 : ");
		System.out.println(me.sum4(10, 20));
		
		System.out.print("6. 반환형(문자열형), 매개변수(문자열형) 둘 다 있는 메서드 : ");
		System.out.println(me.sum5("송", "명규"));
	}
}

class MethodEx {

	//1.반환형, 매개변수 둘 다 없는 메서드
	public void sum0() {
		System.out.println(10 + 5);
	}

	//2. 반환형은 없고, 매개변수(정수형)는 있는 메서드
	public void sum1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	//3. 반환형(정수형), 매개변수(정수형) 둘 다 있는 메서드
	public int sum2(int num1, int num2) {
		return num1 + num2;
	}
	
	//4. 반환형(문자열형), 매개변수(정수형) 둘 다 있는 메서드
	public String sum3(int num1, int num2) {
		return "\"" + Integer.toString(num1 + num2) + "\"";
	}
	
	//5. 반환형(실수형), 매개변수(정수형) 둘 다 있는 메서드
	public double sum4(int num1, int num2) {
		return num1 + num2;
	}
	
	//6. 반환형(문자열형), 매개변수(문자열형) 둘 다 있는 메서드
	public String sum5(String str1, String str2) {
		return str1 + str2;
	}
}