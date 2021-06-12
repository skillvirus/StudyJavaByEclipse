package lecture.example.classInheritance;

public class AISpeaker {
	private String name;
	private String location;
	
	public AISpeaker() {
		
	}
	
	public AISpeaker(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public void turnOn() {
		System.out.println(name + " 전원 ON");
	}
	
	public void turnOff() {
		System.out.println(name + " 전원 OFF");
	}
	
	/*
	 turnOn 메소드 오버로딩 
	 */
	public void turnOn(String name) {
		System.out.println(name + " 전원 ON");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public static void reply() {
		System.out.println("네~");
	}
	
}
