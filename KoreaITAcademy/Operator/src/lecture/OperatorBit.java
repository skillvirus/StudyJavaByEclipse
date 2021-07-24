package lecture;

public class OperatorBit {

	public static void main(String[] args) {
		int a = 3; //0011
		int b = 6; //0110
		
		int c = a & b;
		int d = a | b;
		int e = a ^ b;
		int f = ~a;
		int g = a << 1;
		int h = a >> 2;
		
		System.out.println("비트연산자 " + a + " & " + b + " = " + c); //둘다 1이면 1 
		System.out.println("비트연산자 " + a + " | " + b + " = " + d); //둘중에 하나라도 1이면 1
		System.out.println("비트연산자 " + a + " ^ " + b + " = " + e); //두개가 다르면 1
		System.out.println("비트연산자 ~" + a + " = " + f);
		System.out.println("비트연산자 " + a + " << 1 = " + g);
		System.out.println("비트연산자 " + a + " >> 2 = " + h);
		
//		char[] arr = { 'A', 'a', 'Z', 'z' };
//		char hexCode = 0x20;
//		
//		for (char ch : arr) {
//			char tmp = (char) (hexCode ^ ch);
//			System.out.println(tmp);
//		}
	}
}