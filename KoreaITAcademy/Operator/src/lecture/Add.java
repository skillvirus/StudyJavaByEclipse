package lecture;

public class Add {
	public static void main(String[] args) {
		int a = 1, b = 1, c = 1, d = 1;
		
		a = a + 1;
		System.out.println("a : " + a);
		
		b += 1; //복합할당 연산자
		System.out.println("b : " + b);
		
		++c; //증감연산자(전위)
		System.out.println("c : " + c);
		
		d++; //증감연산자(후위)
		System.out.println("d : " + d);
	}
}
