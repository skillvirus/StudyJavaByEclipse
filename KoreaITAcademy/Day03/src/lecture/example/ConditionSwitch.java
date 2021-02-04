package lecture.example;

public class ConditionSwitch {

	public static void main(String[] args) {
		int age = 20;
		
		switch (age) {
//			case 8:
//				System.out.println("초등학생입니다.");
//				break;
//			case 9:
//				System.out.println("초등학생입니다.");
//				break;
//			case 10:
//				System.out.println("초등학생입니다.");
//				break;
//			case 11:
//				System.out.println("초등학생입니다.");
//				break;
//			case 12:
//				System.out.println("초등학생입니다.");
//				break;
//			case 13:
//				System.out.println("초등학생입니다.");
//				break;
		
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
				System.out.println("초등학생입니다.");
				break;
			case 14:
			case 15:
			case 16:
				System.out.println("중학생입니다.");
				break;
			case 17:
			case 18:
			case 19:
				System.out.println("고등학생입니다.");
				break;
			default:
				System.out.println("성인입니다.");
				break;
		}
	}
}
