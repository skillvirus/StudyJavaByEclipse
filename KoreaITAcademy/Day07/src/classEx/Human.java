package classEx;

public class Human extends Animal implements Moveable, Talkable {

	public Human(int age) {
		super(age);
	}

	@Override
	public void talk() {
		System.out.println("Talk : 말을 한다.");
	}
	
	@Override
	public void move() {
		System.out.println("Move : 두발로 걷는다.");
	}
}
