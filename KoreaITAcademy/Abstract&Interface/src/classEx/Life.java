package classEx;

//인터페이스 : 구현객체의 동일한 동작을 보장 (Has-A 관계)
//추상클래스 : 상속을 이용하여 기능 확장 (Is-A 관계)

//생명체(최상위 추상클래스)
public abstract class Life {
	private int age; //나이
	
	public Life(int age) {
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void takeNutrition(); //영양분섭취를 표현할 추상메소드
}
