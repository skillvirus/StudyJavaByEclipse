package classEx;

public class Bird extends Animal implements Flyable {

	public Bird(int age) {
		super(age);
	}

	@Override
	public void fly() {
		System.out.println("Fly : 하늘을 날다.");
	}
}
