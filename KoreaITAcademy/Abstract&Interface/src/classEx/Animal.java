package classEx;

public abstract class Animal extends Life {

	public Animal(int age) {
		super(age); //super : 상위 클래스 객체 참조
	}

	public void takeNutrition() {
		System.out.println("Eat : 음식을 먹는다."); //다형성
	}
}
