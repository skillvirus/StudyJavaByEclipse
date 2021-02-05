package lecture.example.classEx;

public class Television {
	
	int channel;
	int volume;
	String tvName;
	
	Television () {
	}
	
	Television (String tvName) {
		this.tvName = tvName;
	}
	
	public void turnOn() {
		System.out.println(this.tvName + "의 TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(this.tvName + "의 TV를 끕니다.");
	}
	
	public int downChannel() {
		return this.channel--;
	}
	
	public int upChannel() {
		return this.channel++;
	}
}
