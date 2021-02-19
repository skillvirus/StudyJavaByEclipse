package lecture.example.classEx;

public class Computer {

	public String computerName;
	
	public Computer(String computerName) {
		this.computerName = computerName;
	}
	
	public void turnOn() {
		System.out.println(this.computerName + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(this.computerName + "의 전원을 끕니다.");
	}
}
