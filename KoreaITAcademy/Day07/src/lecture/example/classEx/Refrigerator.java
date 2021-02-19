package lecture.example.classEx;

public class Refrigerator {
	
	private String refrigeratorName;
	
	public Refrigerator() {
	}
	
	public Refrigerator(String refrigeratorName) {
		this.refrigeratorName = refrigeratorName;
	}
	
	public void turnOn() {
		System.out.println(this.refrigeratorName + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(this.refrigeratorName + "의 전원을 끕니다.");
	}
}
