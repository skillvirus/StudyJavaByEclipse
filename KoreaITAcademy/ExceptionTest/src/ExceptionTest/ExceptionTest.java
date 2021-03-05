package ExceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int result;
		
		try {
			result = a/b;
			System.out.println(result);
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println("오류 발생 : " + e.getMessage());
		}
	}
}
