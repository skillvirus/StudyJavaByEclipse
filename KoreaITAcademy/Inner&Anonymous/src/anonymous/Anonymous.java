package anonymous;

public class Anonymous {
	
	/*
		주로 Swing, AWT 같은 GUI 프로그래밍 이벤트에서 사용
		
		1. [형태]
		상위클래스 인스턴스 = new 상위클래스() {
		};
		
		2. 한번 사용후 버려짐
	*/
	public static void main(String[] args) {
		
//		SubClass subClass = new SubClass();
//		subClass.print();
		
		UpperClass upperClass = new UpperClass() {
			String print = "상위 클래스#2";
			@Override
			public void print() {
				System.out.println(print);
			}
		};
		upperClass.print();
	}
	
}
