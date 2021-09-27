package lecture;

public class OverloadingTest {
	
	public static void main(String[] args) {
		ClassTest classTest = new ClassTest();
		classTest.doSomething();
		classTest.doSomething(0);
		classTest.doSomething("매개변수 있는 메소드");
	}
	
}

class ClassTest {
	public void doSomething() {
		System.out.println("매개변수 없는 메소드");
	}
	
	public void doSomething(String param) {
		System.out.println(param);
	}
	
	public void doSomething(int param) {
		System.out.println(param);
	}
}
