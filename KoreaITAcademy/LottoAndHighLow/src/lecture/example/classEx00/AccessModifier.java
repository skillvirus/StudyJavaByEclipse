package lecture.example.classEx00;

import lecture.example.classEx00.sub.AccessModifier2; //외부 패키지 예제 설명시 추가

public class AccessModifier {

	public static void main(String[] args) {
		//private 접근제어자
		PrivateModifier privateModifier = new PrivateModifier();
		//privateModifier. 멤버변수와 메소드 접근 불가
		
		//public 접근제어자
		PublicModifier publicModifier = new PublicModifier();
		publicModifier.name = "HI";
		System.out.println(publicModifier.getName());
		
		//protected 접근 제어자(동일한 패키지 내부이므로 접근 가능)
		ProtectedModifier protectedModifier = new ProtectedModifier();
		protectedModifier.name = "HI2";
		System.out.println(protectedModifier.getName());
		
		//default 접근 제어자
		DefaultModifier defaultModifier = new DefaultModifier();
		defaultModifier.name = "HI3";
		System.out.println(defaultModifier.name);
		
		//외부 패키지의 클래스를 객체화 해서 접근제어자 알아보기
		AccessModifier2 accessModifier = new AccessModifier2();
		accessModifier.publicName = "HI4"; //다른 패키지이므로 public 만 접근 가능 
	}

}

//private : 외부클래스에서 접근 불가
class PrivateModifier {
	private String name;
	private String getName() {
		return this.name;
	}
}

//public : 외부클래스에서 자유롭게 접근 가능
class PublicModifier {
	public String name;
	public String getName() {
		return this.name;
	}
}

//protected : 동일 페키지 내의 클래스 또는 상속 받은 클래스 접근 가능
class ProtectedModifier {
	protected String name;
	protected String getName() {
		return this.name;
	}
}

//defalut : 별도로 설정하지 않으면 해당 패키지 내에서만 접근 가능
class DefaultModifier {
	String name;
}