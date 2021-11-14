package lecture.example.classEx02Inheritance;

public class AISpeaker extends Electronics {
	public AISpeaker() {
	}
	
	public AISpeaker(String name, String location) {
		super(name, location); //super() 메서드 : 상위클래스 생성자 호출
	}
	
	public static void reply() {
		System.out.println("네~");
	}
}
