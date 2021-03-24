package lecture.example;

public class ConditionIf {

	public static void main(String[] args) {
		int age = 10;
		
		if (age < 8) {
			System.out.println("미취학 아동입니다.");
		} else if (age >= 8 && age < 14) {
			System.out.println("초등학생입니다.");
		} else if (age >= 14 && age < 17) {
			System.out.println("중학생입니다.");
		} else if (age >= 17 && age < 20) {
			System.out.println("고등학생입니다.");
		} else {
			System.out.println("성인입니다.");
		}
	}
}
