package lecture;

public class OverridingTest {

	public static void main(String[] args) {
		Class01 class01 = new Class01();
		class01.doSomething();
		
		Class02 class02 = new Class02();
		class02.doSomething();
	}

}

class Class01 {
	public void doSomething() {
		System.out.println("상위 클래스 메소드");
	}
}

class Class02 extends Class01 {
	@Override
	public void doSomething() {
		System.out.println("하위 클래스 메소드");
	}
}