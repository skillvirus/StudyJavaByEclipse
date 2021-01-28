package lecture.example;

public class OperatorShift {

	public static void main(String[] args) {
		byte a = 8 << 2; //8(00001000)을 2만큼 왼쪽으로 비트를 옮김 -> 32(00100000)
		byte b = 8 >> 2; //8(00001000)을 2만큼 오른쪽으로 비트를 옮김 -> 2(00000010)
		
		System.out.println("비트연산자 << 를 이용하여 8과 2를 연산한 변수 a : " + a);
		System.out.println("비트연산자 >> 를 이용하여 8과 2를 연산한 변수 b : " + b);
	}

}
