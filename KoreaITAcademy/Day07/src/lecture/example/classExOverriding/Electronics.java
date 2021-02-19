package lecture.example.classExOverriding;

public class Electronics {
	
	private String deviceName;
	
	public Electronics () {
	}
	
	public Electronics (String deviceName) {
		this.deviceName = deviceName;
	}
	
	public void turnOn() {
		System.out.println(deviceName + " 전원 켬");
	}
	
	public void turnOff() {
		System.out.println(deviceName + " 전원 끔");
	}
}
