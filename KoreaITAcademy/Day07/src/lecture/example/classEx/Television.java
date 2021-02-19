package lecture.example.classEx;

public class Television {
	
	private int channel;
	private int volume;
	private String tvName;
	
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
	
	public int getChannel() {
		return this.channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int downVolume() {
		return this.volume--;
	}
	
	public int upVolume() {
		return this.volume++;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String getTVName() {
		return this.tvName;
	}
}
