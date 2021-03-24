package lecture.example;

public class BreakTest {

	public static void main(String[] args) {
		
		for(int i = 1; i < 5; i++){
            if (i == 3) {
            	break;
            }
            System.out.println(i);
        }
 
        System.out.println("반복문 종료");
	}

}
