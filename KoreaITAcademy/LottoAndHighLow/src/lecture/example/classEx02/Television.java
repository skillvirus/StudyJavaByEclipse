package lecture.example.classEx02;

public class Television {
	private String name;
	private String location;
	
	public Television() {
		
	}
	
	public Television(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public void turnOn() {
		System.out.println(name + " 전원 ON");
	}
	
	public void turnOff() {
		System.out.println(name + " 전원 OFF");
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
}
