package classEx;

public class Dog extends Animal implements Moveable {

	public Dog(int age) {
		super(age);
	}

	@Override
	public void move() {
		System.out.println("Move : 네발로 걷는다.");
	}
	
	@Override
	public void takeNutrition() {
		System.out.println("Eat : 사료를 먹다.");
	}
}
