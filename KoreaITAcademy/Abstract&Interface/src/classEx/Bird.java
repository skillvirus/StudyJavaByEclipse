package classEx;

public class Bird extends Animal implements Moveable, Flyable {

	public Bird(int age) {
		super(age);
	}

	@Override
	public void fly() {
		System.out.println("Fly : 하늘을 날다.");
	}
	
	@Override
	public void move() {
		System.out.println("Move : 땅에서 두발로 걷는다.");
	}
	
	@Override
	public void takeNutrition() {
		System.out.println("Eat : 모이를 먹는다."); //다형성
	}
}
