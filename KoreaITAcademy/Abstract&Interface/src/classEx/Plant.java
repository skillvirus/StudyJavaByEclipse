package classEx;

public abstract class Plant extends Life {

	public Plant(int age) {
		super(age);
	}

	public void takeNutrition() {
		System.out.println("Eat : 광합성을 한다."); //다형성
	}	
}
