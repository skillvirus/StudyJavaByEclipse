package lecture.example.classExInterface;

public class Computer implements Electronics {
	
	private String deviceName;
	
	public Computer () {
	}
	
	public Computer (String deviceName) {
		this.deviceName = deviceName;
	}
	
	public void turnOn() {
		System.out.println(deviceName + " 전원 켬");
	}
	
	public void turnOff() {
		System.out.println(deviceName + " 전원 끔");
	}
}
