//getter와 setter : 어떠한 오브젝트 또는 변수의 값을 가져오거나, 설정해주는 역할을 하는 메소드의 한 종류
//하나의 파일에 다수의 클래스를 선언한 형태의 실습 예제
package lecture.example.classEx00;

public class GetterSetter {

	public static void main(String[] args) {
		RectanglePublic r1 = new RectanglePublic(); //멤버변수를 public으로 선언한 사각형 클래스
		r1.x = 10; //멤버변수에 직접 값을 할당
		r1.y = 10;
		System.out.println("RectanglePublic 클래스를 이용한 사각형의 넓이 : " + r1.calculateArea());
		//해당 변수의 역할을 개발자가 미리 알고 있어야 함
		//해당 클래스의 코드를 직접 IDE와 같은 도구로 열어서 분석해야하는 문제 발생

		RectanglePrivate r2 = new RectanglePrivate(); //멤버변수를 private으로 선언하고 getter와 setter를 이용하여 접근
		r2.setHeight(10);
		r2.setWidth(10);
		System.out.println("RectanglePrivate 클래스를 이용한 사각형의 넓이 : " + r2.calculateArea());
		//개발자는 해당클래스의 변수 역할을 알 필요가 없음(캡슐화)
		//변수에 대한 읽기 쓰기 기능 구현 가능
		
		HumanPublic h1 = new HumanPublic();
		h1.a = 1976;
		System.out.println("HumanPublilc 클래스를 이용한 나이 계산 : " + h1.cal(2021));
		
		HumanPrivate h2 = new HumanPrivate();
		h2.setBirthYear(1976);
		System.out.println("HumanPrivate 클래스를 이용한 나이 계산 : " + h2.calculateAge(2021));
		//이후 태어난 년도에 대한 수정(변경)이 가능(부적절)
		//h2.setBirthYear(1980) <- 가능(실제 현실세계에서는 일어나면 안되는 일)
		
		Human h = new Human(1976); //객체를 생성할 때 태어난 년도 지정
	 	System.out.println("Human 클래스를 이용한 나이 계산 : " + h.calculateAge(2021));
	 	
	}

}

//사각형 클래스(멤버변수에 직접 접근)
class RectanglePublic {
	//멤버변수를 public으로 선언
	//누구든지 해당 변수에 접근해서 값 변경 가능
	public double x;
	public double y;
	
	public double calculateArea() {
		return x * y;
	}
}

//사각형 클래스(getter/setter 이용)
class RectanglePrivate {
	//멤버변수를 private으로 선언
	//허용된 기능(읽기 또는 쓰기)만 사용 가능
	private double x;
	private double y;
	
	public void setHeight(double x) {
		this.x = x;
	}
	
	public double getHeight() {
		return this.x;
	}
	
	public void setWidth(double y) {
		this.y = y;
	}
	
	public double getWidth() {
		return this.y;
	}
	
	public double calculateArea() {
		return this.x * this.y;
	}
	
	//getter와 setter 메소드 주석처리 해보기
}

//사람클래스(멤버변수에 직접 접근)
//변수명 명명규칙(컨벤션) 무시, getter/setter미사용
//부적절한 클래스 사용 방식
class HumanPublic {
	public int a; //태어난 년도
	
	//나이 계산
	public int cal(int x) {
		return x - a;
	}
}

//사람클래스(setter 이용)
class HumanPrivate {
	private int birthYear;
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	public int calculateAge(int currentYear) {
		return currentYear - this.birthYear;
	}
}

//생성자를 이용하여 태어난 년도를 객체 생성 이후 수정 불가하게 만들어보기
//getter만 구현
class Human {
	private int birthYear;	
	
	public Human() {
	}
	
	public Human(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	public int calculateAge(int currentYear) {
		return currentYear - this.birthYear;
	}
}