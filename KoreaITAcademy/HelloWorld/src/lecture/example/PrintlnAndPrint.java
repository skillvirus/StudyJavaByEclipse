package lecture.example;

public class PrintlnAndPrint {
	public static void main(String[] args) {
		
		System.out.write(65); //A출력(65는 아스키 코드로 A)
		System.out.flush(); //"버퍼의 데이터"(flush 코드 이전의 데이터)를 스크린(화면)에 표시
		
		System.out.println(); //개행
		System.out.println(); //개행
		
		System.out.print("가나다");
		System.out.print("라마바");
		System.out.println("가나다");
		System.out.println("라마바");
		
		System.out.println();
		System.err.println("오류 발생");
		
		System.out.println(); //개행
		
		//C의 printf 함수 사용 가능
		System.out.printf("%d \n", 10); //정수
		System.out.printf("%f \n", 10.5f); //실수(소수점 자릿수 미지정)
		System.out.printf("%.2f \n", 10.5f); //실수(소수점 자릿수 지정)
		System.out.printf("%c \n", 'A'); //문자
		System.out.printf("%s \n", "String"); //문자열
		System.out.printf("%b \n", false); //boolean(논리)
	}
}
